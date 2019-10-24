package mykhailo_kaloshyn.mainacad;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class Education {

    public static void main(String[] args) {

        Connection dbConnection = null;
        Set<Integer> schoolsWithInformatics = new HashSet<>();

        try {
            dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                            "education?useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatatimeCode=false&serverTimezone=UTC",
                    "root",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Statement st = dbConnection.createStatement()) {
            st.execute("SELECT teacher_id, teacher_name, subject_name, school_id " +
                    "FROM teachers T LEFT JOIN subjects S " +
                    "ON T.subject_id = S.subject_id " +
                    "WHERE subject_name = \"Informatics\"");
            ResultSet result = st.getResultSet();
            while (result.next()) {
                Integer schoolNumberWithInfo = result.getInt(4);
                schoolsWithInformatics.add(schoolNumberWithInfo);
            }

            for (Integer schoolsWithInformatic : schoolsWithInformatics) {

                int index = 0;
                st.execute("SELECT * FROM teachers");
                ResultSet resultB = st.getResultSet();
                while (resultB.next()) {
                    if (resultB.getInt(1) > index) {
                        index = resultB.getInt(1);
                    }
                }
                String str = "INSERT INTO teachers VALUES (" + (index + 1) + ",\"new teacher\",9," + schoolsWithInformatic + ")";
                st.execute(str);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(schoolsWithInformatics);

        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


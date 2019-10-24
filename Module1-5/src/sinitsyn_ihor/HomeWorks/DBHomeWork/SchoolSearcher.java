package sinitsyn_ihor.HomeWorks.DBHomeWork;

import java.sql.*;
import java.util.Random;

public class SchoolSearcher {
    public static void main(String[] args) {
        Connection newConnect = SchoolGenerator.CreateConnection();
        try (Statement st = newConnect.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT school.id As school_id, school.number As school_number, teacher.name As teacher_name, subject.subj As subject FROM kicum.school LEFT JOIN kicum.teacher ON school.id = teacher.school_id LEFT JOIN kicum.subject ON teacher.subject_id = subject.id WHERE teacher.subject_id = 5");
            if (rs.wasNull()){
                System.out.println("We have not schools with informatics!");
            } else {
                st.execute("INSERT INTO subject (id, subj) VALUES (9, 'PC Architect')");
                Random rand = new Random();
                for (int i = 0; i < 3; i++) {
                    int j = rs.getInt(2);
                    String teacherName = SchoolGenerator.name[rand.nextInt(SchoolGenerator.name.length)] + " " + SchoolGenerator.surname[rand.nextInt(SchoolGenerator.surname.length)];
                    String generateTeacher = "INSERT INTO teacher (id, name, school_id, subject_id) VALUES (" + 21 + ", '" + teacherName + "', " + j + ", " + 9 + ")";
                    st.execute(generateTeacher);
                }
            }
//            st.execute("drop table school");
//            st.execute("drop table subject");
//            st.execute("drop table teacher");
            System.out.println("Done!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package sinitsyn_ihor.Works.DBConnect;

import java.sql.*;

public class WorkWithDB {
    public static void main(String[] args) {
        Connection dbConnect = null;
        try {
            dbConnect = DriverManager.getConnection(
//                    "jdbc:mysql://www.db4free.net:3306/fortestsqlbrain",
//                    "fortestsqlbrainu",
//                    "Test123123");
                    "jdbc:mysql://localhost:3306/world?useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",
                    "d6-rg1t3injhv7ma");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        if (dbConnect != null){
            System.out.println("DONE");
        }
        try (Statement st = dbConnect.createStatement()){
            st.execute("SELECT * FROM users");
            ResultSet rs = st.getResultSet();
            while (rs.next()){
                User user = new User();
                user.setName(rs.getString(1));
                user.setAge(rs.getInt(2));
                user.setCompany(rs.getString(3));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

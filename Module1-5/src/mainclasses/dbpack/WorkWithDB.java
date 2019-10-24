package mainclasses.dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorkWithDB {

    public static void main(String[] args) {


        List<User> userList = new ArrayList<>();

        Connection dbConnection = null;

        try {
            dbConnection = DriverManager.getConnection(
                    "jdbc:mysql://www.db4free.net:3306/fortestsqlbrain",
                    "fortestsqlbrainu",
                    "Test123123"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (dbConnection != null) {
            System.out.println("DONE");
        }


        String query = "Insert INTO users values(?,?,?,?)";

        try (PreparedStatement ps = dbConnection.prepareStatement(query);
             Statement st = dbConnection.createStatement()) {
            ps.setInt(1, 4);
            ps.setInt(2, 30);
            ps.setInt(3, 3);
            ps.setString(4, "Oleg Ivanov");
            ps.executeUpdate();

            st.execute("SELECT username, age, C.name  FROM users U LEFT JOIN Company C ON U.company= C.id");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {

                User user = new User();
                user.setName(rs.getString(1));
                user.setAge(rs.getInt(2));
                user.setCompanyName(rs.getString(3));

                userList.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (User user : userList) {
            System.out.println(user);
        }
    }
}

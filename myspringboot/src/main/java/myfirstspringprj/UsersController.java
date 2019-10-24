package myfirstspringprj;

import mainclasses.dbpack.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {


    @ResponseBody
    @RequestMapping("/users")
    public java.util.List<User> getUsers(){

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
//            ps.setInt(1, 4);
//            ps.setInt(2, 30);
//            ps.setInt(3, 3);
//            ps.setString(4, "Oleg Ivanov");
//            ps.executeUpdate();

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

        StringBuilder sb = new StringBuilder();
        for (User user : userList) {
            System.out.println(user);
            sb.append(user).append("/n");
        }
        return userList;
    }

}

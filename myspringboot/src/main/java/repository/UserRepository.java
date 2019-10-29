package repository;

import mainclasses.dbpack.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository extends AbstractRepository {

    public void addUser(int age, int companyId, String name){
        Connection connection = getConnection();

        String query = "Insert INTO users values(?,?,?,?)";

        try (PreparedStatement ps = connection.prepareStatement(query)) {
//            ps.setInt(1, 4);
            ps.setInt(2, age);
            ps.setInt(3, companyId);
            ps.setString(4, name);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<User> getUsers(){

        Connection connection = getConnection();


        try (Statement st = connection.createStatement()) {

            st.execute("SELECT username, age, C.name, active  FROM users U LEFT JOIN Company C ON U.company= C.id");
            return getUsers( st);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    public List<User> getUsersByCompany(int companyId) {

        Connection connection = getConnection();
        try (Statement st = connection.createStatement()) {
            st.execute("SELECT username, age, C.name, active  FROM users U LEFT JOIN Company C ON U.company= C.id where U.company=" + companyId);
            return getUsers(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private List<User> getUsers(Statement st) throws SQLException {

        List<User> userList = new ArrayList<>();
        ResultSet rs = st.getResultSet();

        while (rs.next()) {

            User user = new User();
            user.setName(rs.getString(1));
            user.setAge(rs.getInt(2));
            user.setCompanyName(rs.getString(3));
            user.setActive(rs.getBoolean(4));

            userList.add(user);
        }
        return userList;
    }

}

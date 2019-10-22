package mainclasses.dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WorkWithDB {

    public static void main(String[] args) {

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

        if (dbConnection != null ) {
            System.out.println("DONE");
        }
    }
}

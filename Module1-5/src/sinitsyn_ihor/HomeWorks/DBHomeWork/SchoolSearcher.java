package sinitsyn_ihor.HomeWorks.DBHomeWork;

import java.sql.*;

public class SchoolSearcher {
    public static void main(String[] args) {
        Connection newConnect = SchoolGenerator.CreateConnection();
        try (Statement st = newConnect.createStatement()) {
            st.execute("drop table school");
            st.execute("drop table subject");
            st.execute("drop table teacher");
            System.out.println("Done!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

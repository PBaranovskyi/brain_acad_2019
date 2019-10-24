package sinitsyn_ihor.HomeWorks.DBHomeWork;

import java.sql.*;
import java.util.Random;

public class SchoolGenerator {

    public static void main(String[] args) {
        String[] name = {"Alex", "Ivan", "Andrew", "John", "Viola", "Sonya", "Victoria", "Iren"};
        String[] surname = {"Bond", "Snow", "Sand", "Smith", "Black", "Bailey", "White", "Snowden"};
        String[] subjects = {"Algebra", "Geometry", "Chemistry", "Language", "Informatics", "Literature", "Physics", "Biology"};

        //Create connection to DB server:
        Connection newConnect = CreateConnection();
        try (Statement st = newConnect.createStatement()) {

            //Create tables:
            st.execute("create table school (id int null, number int null)");
            st.execute("create table subject (id int null, subj text null)");
            st.execute("create table teacher (id int null, name text null, school_id int null, subject_id int null)");

            //Generate schools:
            for (int i = 1; i <= 5; i++) {
                String generateSchool = "INSERT INTO school (id, number) VALUES (" + i + ", '" + (i * 2 + i) + "')";
                st.execute(generateSchool);
            }

            //Generate subjects:
            for (int i = 1; i <= 8; i++) {
                String generateSubject = "INSERT INTO subject (id, subj) VALUES (" + i + ", '" + subjects[i - 1] + "')";
                st.execute(generateSubject);
            }

            //Generate teachers:
            for (int j = 1; j <= 20; j++) {
                Random rand = new Random();
                String teacherName = name[rand.nextInt(name.length)] + " " + surname[rand.nextInt(surname.length)];
                int x = rand.nextInt(4) + 1;
                int y = rand.nextInt(7) + 1;
                String generateTeacher = "INSERT INTO teacher (id, name, school_id, subject_id) VALUES (" + j + ", '" + teacherName + "', " + x + ", " + y + ")";
                st.execute(generateTeacher);
            }
            System.out.println("Done!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection CreateConnection() {
        Connection dbConnect = null;
        try {
            dbConnect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kicum?useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",
                    "d6-rg1t3injhv7ma");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (dbConnect == null) {
            System.out.println("Connection error!");
        } else {
            System.out.println("Connection established!");
        }
        return dbConnect;
    }
}

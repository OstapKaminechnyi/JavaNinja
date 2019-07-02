package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Repo\\java-course\\java-june-course\\databases\\testjava.db");
//            Statement statement = conn.createStatement()
//         ){
//            statement.execute("CREATE table contacts(name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Repo\\java-course\\java-june-course\\databases\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE table IF NOT EXISTS " +
                    "contacts(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO " +
//                    "contacts(name, phone, email) VALUES ('JOE',13289,'roganjoe@email.com')");
//            statement.execute("INSERT INTO " +
//                    "contacts(name, phone, email) VALUES ('JANE',424149,'jane@email.com')");
//            statement.execute("INSERT INTO " +
//                    "contacts(name, phone, email) VALUES ('Fido',014010,'dog@email.com')");
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                results.getString("email"));
            }
            results.close();
            statement.close();
            conn.close();
//            Class.forName("org.sql.JDBC");
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

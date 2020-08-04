package com.b1n.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    static String timeZoneErrorFixedString = "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false" + timeZoneErrorFixedString;
        String user = "hbstudent";
        String pass = "hbstudent";
        try {

            System.out.println("Connecting to database: " + jdbcURL);

            Connection conn = DriverManager.getConnection(jdbcURL, user, pass);
            System.out.println("Connection successful!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

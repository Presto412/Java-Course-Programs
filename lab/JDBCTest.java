package lab;

import java.sql.*;

public class JDBCTest {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/student";

    static final String USER = "root";
    static final String PASS = "my_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO MARKS VALUES(979, 'Priyansh Jain', 94)";
            ResultSet rs = stmt.executeQuery(sql);
            sql = "SELECT ROLLNO, NAME, PERCENTAGE FROM MARKS";
            rs = stmt.executeQuery(sql);

            System.out.println("ROLLNO | NAME | PERCENTAGE");
            while (rs.next()) {

                System.out.print(rs.getInt("ROLLNO") + "|");
                System.out.print(rs.getString("NAME") + "|");
                System.out.print("PERCENTAGE: " + rs.getInt("PERCENTAGE"));
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}

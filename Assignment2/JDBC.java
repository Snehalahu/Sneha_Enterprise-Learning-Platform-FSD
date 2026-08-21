import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        try {
            // 1. Connect to database
            Connection con = DriverManager.getConnection(url, username, password);

            // 2. Create SQL query
            String query = "SELECT * FROM students";

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery(query);

            // 5. Display records
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course")
                );
            }

            // 6. Close connection
            con.close();

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

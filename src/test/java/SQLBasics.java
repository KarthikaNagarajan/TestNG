import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLBasics {

    public static void main(String[] args) {

        try {
            // 1. Database details
            String url = "jdbc:h2:mem:testdb";
            String user = "sa";
            String pass = "";

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to DB!");

            Statement stmt = con.createStatement();

            // 3. Create table
            String createTable = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(50))";
            stmt.executeUpdate(createTable);

            // 4. Insert sample data
            String insert = "INSERT INTO users VALUES (1, 'Karthi', 'karthi@test.com')";
            stmt.executeUpdate(insert);

            // 5. Query data
            String query = "SELECT name, email FROM users WHERE id = 1";
            ResultSet rs = stmt.executeQuery(query);

            // 6. Print result
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

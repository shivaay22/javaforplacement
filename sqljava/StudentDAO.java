import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

    public void showAllStudents() {
        try {
            Connection con = DBConnection.getInstance().getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            System.out.println("\n--- Crickters Table Data ---");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Email: " + rs.getString("email")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

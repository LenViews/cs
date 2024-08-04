import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// import javax.management.Query;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Test", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test where id<0");
            while (rs.next()) {
                System.out.println();
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Could not load driver"+cnfe.getMessage());
        }
    }
}
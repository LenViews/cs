import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// import javax.management.Query;

public abstract class App {
    public abstract void selectOperation();
    public abstract void updateOperation();
    public abstract void insertOperation();
    public abstract void deleteOperation();

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // System.out.println("Driver loaded successfully!");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user where id > 0");
            while (rs.next()) {
                String school = rs.getString("school");
                String name = rs.getString("name");
                System.out.println("Name:"+name);
                System.out.println("School:"+school);
            }
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Could not load driver"+cnfe.getMessage());
        }

    }
}
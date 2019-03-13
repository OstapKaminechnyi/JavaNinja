import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteDemo {
    public static void main(String [] a){
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:test.db");

        }
        catch (Exception e){
            System.err.print(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.print("opened database successfully ");
    }
}

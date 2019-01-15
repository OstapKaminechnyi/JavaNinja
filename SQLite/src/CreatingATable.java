import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingATable {
    public static void main(String[] a){
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.print("Opened database");
            statement=connection.createStatement();
            String sql = "CREATE TABLE COMPANY"+"(ID INT PRIMARY KEY NOT NULL, "+
                    "NAME TEXT NOT NULL," +
                    "AGE INT NOT NULL, " +
                    "ADDRESS CHAR(50), "+
                    "SALARY REAl)";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
        }
        catch (Exception e){
            System.out.print(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.print("\n Table is created");
    }
}

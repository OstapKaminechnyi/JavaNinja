import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {
    public static void main(String a[]){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:test.db");
            connection.setAutoCommit(false);
            System.out.print("Open database");
            statement = connection.createStatement();
            String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)"+
                    "VALUES (2,'OSTAP',19,'UKRAINE',50000.00)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)"+
                    "VALUES (12,'Kaminechnyi',32,'UKRAINE',20000.00)";
            statement.executeUpdate(sql);
            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)"+
                    "VALUES (3,'Ostap Kaminechnyi',20,'UKRAINE',40000.00)";
            statement.executeUpdate(sql);
            statement.close();
            connection.commit();
            connection.close();
        }
        catch (Exception e){
            System.out.print(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
            System.out.print("\n Record Created");
        }
    }

}

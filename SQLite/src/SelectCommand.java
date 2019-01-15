import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectCommand {
    public static void main(String[] a) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            connection.setAutoCommit(false);
            System.out.print("Open database");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM COMPANY");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                float salary = resultSet.getFloat("salary");

                System.out.print("ID= " + id);
                System.out.print("NAME= " + name);
                System.out.print("AGE= " + age);
                System.out.print("ADDRESS= " + address);
                System.out.print("SALARY= " + salary);
                System.out.println();
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.print(e.getClass().getName() + ":" + e.getMessage());
            System.exit(0);

        }
        System.out.println("Operation is done");

    }
}

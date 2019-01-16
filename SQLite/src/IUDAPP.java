import javax.management.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class IUDAPP extends JFrame {
    JLabel jLabelFirstName, jLabelLastName,jLabelAge,jLabelId;
    JTextField jTextFieldFirstName, jTextFieldLastName, jTextFieldAge,jTextFieldId;

    JButton buttonInsert, buttonUpdate, buttonDelete;
    public IUDAPP(){
        super("Insert Update Delete App ");
        jLabelId = new JLabel("ID: ");
        jLabelFirstName=new JLabel("FirstName: ");
        jLabelLastName= new JLabel("LastName: ");
        jLabelAge=new JLabel("Age: ");

        jLabelFirstName.setBounds(20,20,100,20);
        jLabelLastName.setBounds(20,50,100,20);
        jLabelAge.setBounds(20,80,100,20);
        jLabelId.setBounds(20,110,100,20);

        jTextFieldAge=new JTextField(20);
        jTextFieldFirstName=new JTextField(20);
        jTextFieldLastName=new JTextField(20);
        jTextFieldId=new JTextField(20);

        jTextFieldId.setBounds(130,20,150,20);
        jTextFieldAge.setBounds(130,50,150,20);
        jTextFieldFirstName.setBounds(130,80,150,20);
        jTextFieldLastName.setBounds(130,110,150,20);

        buttonInsert=new JButton("Insert");
        buttonDelete=new JButton("Delete");
        buttonUpdate=new JButton("Update");

        buttonInsert.setBounds(300,50,80,20);
        buttonUpdate.setBounds(300,80,80,20);
        buttonDelete.setBounds(300,110,80,20);

        setLayout(null);
        add(jLabelId);
        add(jLabelFirstName);
        add(jLabelLastName);
        add(jLabelAge);
        add(jTextFieldFirstName);
        add(jTextFieldLastName);
        add(jTextFieldAge);
        add(jTextFieldId);
        add(buttonDelete);
        add(buttonInsert);
        add(buttonUpdate);

        buttonInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    theQuery("Create Table Users(ID INT NOT NULL,FIRSTNAME TEXT NOT NULL ,LASTNAME TEXT NOT NULL ,AGE INT NOT NULL); INSERT INTO Users(ID,FIRSTNAME,LASTNAME,AGE) VALUES (' "+jTextFieldId.getText()+"','"
                            +jTextFieldFirstName.getText()+"','"+jTextFieldLastName.getText()+"','"
                            +jTextFieldAge.getText()+"');");
                }
                catch (Exception e1){

                }

            }
        });
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    theQuery("UPDATE Users set FIRSTNAME=' "+jTextFieldId.getText()+"','"
                            +jTextFieldFirstName.getText()+"','"+jTextFieldLastName.getText()+"','"
                            +jTextFieldAge.getText()+"where id="+jTextFieldId.getText()+")");
                }
                catch (Exception e1){

                }
    }});
        buttonDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        theQuery("DELETE from Users where id= " +jTextFieldId.getText());
                    }
                    catch (Exception e1){

                    }
}});
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,500);

    }
    public void theQuery(String query){
        Connection connection = null;
        Statement statement = null;
        try {
            connection= DriverManager.getConnection("jdbc:sqlite:D:\\Repo\\JavaNinja\\workspace\\SQLite\\test.db",
                    "root","");
            statement=connection.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Query EXECUTED");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }}
        public static void main (String a[]){
        new IUDAPP();
    }
}

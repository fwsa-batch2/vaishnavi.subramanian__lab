import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/firstJava";
        String username = "Vaishnavi";
        String password = "JhonnyMouse2";

        try{
            Connection connect = DriverManager.getConnection(url,username,password);
            String create = "CREATE TABLE records (id int(5) unique auto_increment, names varchar(40))";
            Statement stat = connect.createStatement();
            stat.executeUpdate(create);
            System.out.println("Table created !!");
        }
        catch (SQLException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
    }
  }
}

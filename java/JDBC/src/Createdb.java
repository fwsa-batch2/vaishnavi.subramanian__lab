import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdb {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String username = "Vaishnavi";
        String password = "JhonnyMouse2";

        try{
            Connection connect = DriverManager.getConnection(url,username,password);
            String create = "CREATE DATABASE firstJava";
            Statement stat = connect.createStatement();
            stat.executeUpdate(create);
            System.out.println("Database created !!");
        }
        catch (SQLException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}



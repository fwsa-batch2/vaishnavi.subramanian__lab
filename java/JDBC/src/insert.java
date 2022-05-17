import java.sql.*;

public class insert {
    public static void main(String[] args) {
                String url = "jdbc:mysql://localhost:3306/firstJava";
                String username = "Vaishnavi";
                String password = "JhonnyMouse2";
                try{
                    Connection connect = DriverManager.getConnection(url,username,password);
                    String insert = "INSERT INTO records values (?,?)";
                    PreparedStatement stat = connect.prepareStatement(insert);
                    stat.setInt(1,1);
                    stat.setString(2,"Chithu");
                    stat.executeUpdate();

                    System.out.println("Row is inserted");

                    stat.close();
                    connect.close();
                }
                catch (SQLException e){
                    System.out.println("Something went wrong");
                    e.printStackTrace();
                }
            }
}






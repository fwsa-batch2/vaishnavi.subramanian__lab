package Banking;
public class Account {

    String bank ;
    Integer accountNumber;
    String IFSC = "0000001"; 
    String name;
    String address;

    Integer balance;


    Account( String bankName ,String username, String userAddress ){
        bank = bankName;
        name = username;
        address = userAddress;
        accountNumber = 3272347;
        balance = 0;
    }

    Account( String bankName , String username, String userAddress, Integer userBalance ){
        bank = bankName;
        name = username;
        address = userAddress;
        accountNumber = 3272347;
        balance = userBalance;
    }


    // add money to the account
    public void credit(Integer amount) {
        balance = balance + amount;
        System.out.println( "New balance is : "+ balance);
    }

    // taking money from the account
    public void debit(Integer amount) {
        balance = balance - amount;
        System.out.println( "New balance is : "+ balance);
    }

}
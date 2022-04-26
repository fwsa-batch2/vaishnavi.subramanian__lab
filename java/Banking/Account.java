package Banking;
public class Account {

    private String bank ;
    private int accountNumber;
    private String IFSC = "0000001";
    private String name;
    private String address;
    private int balance;
    
    Account( String bankName ,String username, String userAddress ){
        bank = bankName;
        name = username;
        address = userAddress;
        accountNumber = 3272347;
        balance = 0;
    }

    Account(String bankName , String username, String userAddress, int userBalance ){
        bank = bankName;
        name = username;
        address = userAddress;
        accountNumber = 3272347;
        balance = userBalance;
    }


    // add money to the account
    public void credit(int amount) {
        balance = balance + amount;
        System.out.println( "New balance is : "+ balance);
    }

    // taking money from the account
    public void debit(int amount) {
        balance = balance - amount;
        System.out.println( "New balance is : "+ balance);
    }

}
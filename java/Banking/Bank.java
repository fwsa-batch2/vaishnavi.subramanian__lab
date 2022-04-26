package Banking;

public class Bank {

    Account[] accountList;

    public void createAccount(String username, String userAddress) {
        String bankName = Constant.bankName;
        Account account1 = new Account(bankName, username, userAddress);
        Integer accLen = accountList.length;
        accountList[accLen] = account1;
    }

}

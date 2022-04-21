package Banking;

public class Bank {

    Account[] accountList;

    public void createAccount(String username, String userAddress) {
        String bankName = Constant.bankName;
        Account account1 = new Account(bankName, username, userAddress);
        Integer accLen = getAccountLength();
        accountList[accLen] = account1;
    }



    private Integer getAccountLength(){
        Integer accLen = accountList.length;
        if(accLen == 0){
            return accLen;
        }else {
            return accLen + 1;
        }
    }


}

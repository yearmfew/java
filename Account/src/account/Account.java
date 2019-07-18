package account;

public class Account {

    private String accountNo;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    public Account(){}
    public Account(String accountNo, int balance, String name, String email, int phoneNumber ){
    
        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    
    }
    
    
    public boolean loadMoney(int money) {
        if (money > 0) {
            balance += money;
            return true;
        } else {
            return false;
        }

    }

    public String pullMoney(int money) {
        if (money > 1500) {
            return "too much";
        } else if (money < 0) {
            return "wrong";
        }else if(balance - money < 0){
            return "no enough credit";
        }else{
        balance -= money;
        return "OK";
        }

    }

    /**
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

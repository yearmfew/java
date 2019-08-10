package atmwithobject;

public class account {

    private String userName;
    private String password;
    private double balance;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     * @return String ile if yazarken equals. şeklinde yazmak uzun olduğundan bu
     * şekilde hata kodları oluşturuldu.
     *
     * hata kodları: 1 = yetersiz bakiye 2 = 1500 den fazla para çekme denemesi
     * 0 = işlem başarılı
     *
     */
    public int setBalance(double balance) {
        if (balance < 0) {

            if (balance > this.balance) {
                return 1;
            } else if (balance > 1500) {
                return 2;
            } else {
                this.balance += balance;
                return 0;
            }
        }else{
            this.balance += balance;
            return 0;
        
        }

    }

    public account(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.balance = 100;
    }

    public String login(String userName, String password) {

        while (true) {
            if (userName.equals(this.userName) && password.equals(this.password)) {
                return ("ok");

            } else {

                return "no";

            }

        }

    }

}

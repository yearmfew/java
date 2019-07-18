package account;

public class AtmEkran {

    public static void main(String[] args) {

        Account birol = new Account();

        birol.setAccountNo("DE328404398049034");
        birol.setEmail("birol>birol.com");
        birol.setName("birol");
        birol.setPhoneNumber(1234512345);

        birol.setBalance(100);
        int money = birol.getBalance();

        String sonuc = birol.pullMoney(-1711);
        System.out.println(sonuc);

        System.out.println(birol.getClass());

        System.out.println("***********************");
        
        Account account1 = new Account("DE122121", 1200, "Birol Yılmaz", "birol@dd.com", 12345 );
        
        String name = account1.getName();
        int balance = account1.getBalance();
        System.out.println(name);
        System.out.println(balance);
    }

}

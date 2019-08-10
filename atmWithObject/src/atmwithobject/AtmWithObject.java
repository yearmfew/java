package atmwithobject;

import java.util.Scanner;

public class AtmWithObject {

    public static void main(String[] args) {
        account account1 = new account("brl", "123");
        Scanner input = new Scanner(System.in);
        String islem;
        int money;
        double balance;

        for (int i = 0; i < 3; i++) {

            if (i == 1) {
                System.out.println("Hatalı giriş...");
            }

            System.out.println("******************************************");
            System.out.println("Kullanıcı adınızı ve şifrenizi giriniz...");
            System.out.println("******************************************");
            System.out.println("Kullanıcı Adı: ");
            String userName = input.nextLine();
            System.out.println("Şifre: ");
            String password = input.nextLine();


            String result = account1.login(userName, password);
            if (result.equals("ok")) {
                break;
            }
            if (i == 2 && result.equals("no")) {
                System.out.println("şifreyi 3 kere yanlış girdiniz. Kartınız yutuluyor...");
                System.exit(0);
            }

        }
        while (true) {
            System.out.println("******************************************");
            System.out.println("İliğinizi sömürecek bankaya hoşgeldiniz...");
            System.out.println("******************************************");
            System.out.println("Yapacağınız işlemi ....");
            System.out.println("1. Bakiye görüntüle");
            System.out.println("2. Para çek, varsa tabi...");
            System.out.println("3. Para yükle, ama dikkat et yarın terörist demesinler....");
            System.out.println("4. Çıkmak için 'Ana ben gidiyom' yazın...");
            System.out.println("                        ...seçiniz.");
            System.out.println("******************************************");

            islem = input.nextLine();

            switch (islem) {
                case "1":
                    balance = account1.getBalance();
                    System.out.println("Kalan bakiyeniz: " + balance);
                    break;
                case "2":
                    System.out.println("Ne kadar para çekmek istiyorsunuz");
                    money = input.nextInt();
                    int result = account1.setBalance(-money);

                    if (result == 0) {
                        balance = account1.getBalance();
                        System.out.println("İşlem başarılı");
                        System.out.println("Kalan para: " + balance);
                        break;
                    } else if (result == 2) {
                        System.out.println("Bir günde 1500TL üstü para çekemezsiniz.");
                        break;
                    } else if (result == 1) {
                        System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
                        break;
                    }
                case "3": 
                    System.out.println("Ne kadar para yatırmak istiyorsunuz...");
                    money = input.nextInt();
                    input.nextLine();
                    account1.setBalance(money);
                    balance = account1.getBalance();
                    System.out.println("Kalan bakiyeniz:" + balance);
                    break;
                case "Ana ben gidiyom":
                    System.exit(0);
                
                
                default : 
                    System.out.println("Yanlış bir işlem kodu girdiniz...");
                    break;
                    
            }

        }

    }

}

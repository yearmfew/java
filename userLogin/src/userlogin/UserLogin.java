package userlogin;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int psw = 12345, hata = 0;
        String uName = "birol";

        while (true) {
            System.out.println("Lütfen kullanıcı adını giriniz: ");
            String uNameForm = input.nextLine();
            if (uNameForm.equals(uName)) {
                System.out.println("Hoş geldiniz" + uName);
                break;
            }
            else{
                System.out.println("Böyle bir kullanıcı yok");
            }
        }

        while (true) {
            System.out.println("Lütfen şifrenizi giriniz: ");
            int pswForm = input.nextInt();
            if (pswForm == psw) {
                System.out.println("Giriş başarılı");
            } else {
                hata++;
                System.out.println("Hatalı şifre");
                if (hata == 3) {
                    break;
                }

            }
        }

    }

}

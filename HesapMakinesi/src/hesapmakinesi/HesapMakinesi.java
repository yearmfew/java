
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int a, b, islem, sonuc;
        
        System.out.println("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        b = input.nextInt();
        
        System.out.println("Yapacağınız işlemi seçiniz: ");
        
        System.out.println("1. Toplama "
                + "2. Çıkarma "
                + "3. Bölme "
                + "4. Çarpma ");
        
        islem = input.nextInt();
        switch (islem){
            case 1 :
                sonuc = a + b;
                System.out.println("Sonuç: " + sonuc);
                break;
            
            case 2: 
                sonuc = a - b;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3: 
                double sonuc2 = a / b;
                System.out.println("Sonuç: " + sonuc2);
                break;
            case 4: 
                sonuc = a*b;
                System.out.println("Sonuç: " + sonuc);
                break;
            default:
                System.out.println("Öyle bi işlem nosu mu var lan!!!!!");
                break;
        }
        
        
        
    }
    
}

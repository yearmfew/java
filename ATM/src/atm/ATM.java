
package atm;
import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int bakiye = 100;
        String islem;
        
        
        while(true){
            System.out.println("İşlem seçiniz: ");
            System.out.println("1. Bakiye öğrenme");
            System.out.println("2. Para çekme");
            System.out.println("3. Para yatırma");
            System.out.println("Çıkmak için q ya basınız");
        
            islem = input.nextLine();
            
            
            
            if("1".equals(islem)){
            System.out.println("Kalan bakiyeniz: " + bakiye);
            }
            else if("2".equals(islem)){
            System.out.println("Çekmek istediğiniz miktarı yazınız");
            int para = input.nextInt();
            bakiye = bakiye - para;
            }
            else if("3".equals(islem)){
            System.out.println("Yatırmak istediğiniz miktarı yazınız");
            int para = input.nextInt();
            bakiye = bakiye + para;          
            }
            else if("q".equals(islem)){
            break;
            }
            
            else {
                System.out.println("Geçersiz bir işlem seçtiniz...");
            }
            
        }
        
        
    }
    
}

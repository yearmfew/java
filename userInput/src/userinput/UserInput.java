package userinput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz: ");
        
        int yas = input.nextInt();
        
        System.out.println("yaşınız: " + yas );
        
        input.nextLine(); // Dummy
        /* Burada integer değeri girerken entera basınca java bir değer daha girdik
        diye düşünüyor ve isim değerini boşluk olarak alıyor. Bundan kaçınmak için Dummy olan 
        kısmı yazıyoruz ve entera bastıktan sonraki boşluğu oradaki inputa atmış oluyoruz. 
        
        */
        
        System.out.println("Lütfen adınızı giriniz");
        
        String ad = input.nextLine();
        
        System.out.println("Adınız: " + ad);

    }
    
}

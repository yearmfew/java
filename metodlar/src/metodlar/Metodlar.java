package metodlar;

import java.util.Scanner;

public class Metodlar {

    public static void fac() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sonuc = 1;

        while (x > 0) {
            sonuc *= x;
            x--;

        }
        System.out.println("girilen sayının faktoriyeli " + sonuc);

    }

    public static int ikiKatı(int x){
        
        x *=2;
        return x;
        
    
    }
    
    public static void main(String[] args) {

       // fac();
       int sonuc =  ikiKatı(10);
        System.out.println(sonuc);
    }

}

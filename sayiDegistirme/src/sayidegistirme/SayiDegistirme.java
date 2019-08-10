/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayidegistirme;

import java.util.Scanner;
public class SayiDegistirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       
        int a,b;
        System.out.println("Birinci sayıyı (a) giriniz: ");
        a = input.nextInt();
        
        System.out.println("İkinci sayıyı (b) giriniz: ");
        b = input.nextInt();
        
        int gecici; 
        
        gecici = a;
        a = b; 
        b = gecici;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        
        
    }
    
}

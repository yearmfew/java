/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenüs;

import java.util.Scanner;

        
        public class Hipotenüs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, hipotenüs;
        
        System.out.println("birinci kenarı giriniz: ");
        a = input.nextInt();
        
        System.out.println("İkinci kenarı giriniz: ");
        b = input.nextInt();
        
        hipotenüs = (int) Math.sqrt(a*a + b*b);
       
        System.out.println("Hipotenüs: " + hipotenüs );
    }
    
}

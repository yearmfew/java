/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enbuyuksayibulma;

import java.util.Scanner;

public class EnBuyukSayiBulma {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
       int a, b, c, max;
       
        System.out.println("Birinci sayıyı giriniz: ");
        a = input.nextInt();
                
        System.out.println("İkinci sayıyı giriniz: ");
        b = input.nextInt();
        
        System.out.println("Üçüncü sayıyı giriniz: ");
        c = input.nextInt();
   
        if(a >= b && a >= c){
            max = a;
        }
        else if(b >= a && b >= c ){
            max = b;
        }
        else {
            max = c;
        }
        
     System.out.println("En büyük sayı:" + max);
   
            
  
        
        
        
    }
    
}

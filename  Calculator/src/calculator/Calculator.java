package calculator;

import java.util.Scanner;

public class Calculator {

    public static int toplama(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }

    public static int toplama(int a, int b, int c) {
        int sonuc = a + b + c;
        return sonuc;
    }

    public static int cikarma(int a, int b) {
        int sonuc = a - b;
        return sonuc;
    }

    public static int carpma(int a, int b) {
        int sonuc = a * b;
        return sonuc;
    }

    public static int carpma(int a, int b, int c) {
        int sonuc = a * b * c;
        return sonuc;
    }

    public static double bölme(int a, int b) {
        double sonuc = a / b;
        return sonuc;
    }

    public static int islemSec() {
        Scanner input = new Scanner(System.in);
        int islem;

        System.out.println("************************************************");
        System.out.println("Yapmak istediğiniz işlemi seçin.");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("************************************************");

        islem = input.nextInt();

        return islem;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem = islemSec();
        double sonuc;

        System.out.println("************************************************");

        System.out.println("Kaç tane sayı ile işlem yapacağınızı seçin. En fazla 3");
        int kacSayi = input.nextInt();

        if (kacSayi == 2) {
            System.out.println("Sayı 1:");
            int sayi1 = input.nextInt();
            System.out.println("Sayı 2:");
            int sayi2 = input.nextInt();

            switch (islem) {
                case 1:
                    sonuc = toplama(sayi1, sayi2);
                    System.out.println("İşlemin sonucu: " + sonuc);
                    break;
                case 2:
                    sonuc = cikarma(sayi1, sayi2);
                    System.out.println("İşlemin sonucu: " + sonuc);
                    break;
                case 3:
                    sonuc = bölme(sayi1, sayi2);
                    System.out.println("İşlemin sonucu: " + sonuc);
                    break;
                case 4:
                    sonuc = carpma(sayi1, sayi2);
                    System.out.println("İşlemin sonucu: " + sonuc);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz...");
                    break;

            }
        } else if (kacSayi == 3) {
            System.out.println("Sayı 1:");
            int sayi1 = input.nextInt();
            System.out.println("Sayı 2:");
            int sayi2 = input.nextInt();
            System.out.println("Sayı 3:");
            int sayi3 = input.nextInt();

            switch (islem) {
                case 1:
                    sonuc = toplama(sayi1, sayi2, sayi3);
                    System.out.println("İşlemin sonucu: " + sonuc);
                    break;
                case 2:
                    System.out.println("3 tane sayı ile çıkarma yapamazsınız...");
                    break;
                case 3:
                    System.out.println("3 tane sayı ile bölme yapamazsınız...");
                    break;
                case 4:
                    sonuc = carpma(sayi1, sayi2, sayi3);
                    System.out.println("İşlemin sonucu: " + sonuc);

                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz...");
                    break;

            }
        }

    }

}

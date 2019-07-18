package overloading;

public class Overloading {

    public static void carpma(int x, int y){
    int sonuc = x*y;
        System.out.println(sonuc);
    }
    public static void carpma(int x, int y, int z) {
        int sonuc = x * y * z;

        System.out.println(sonuc);

    }

    public static void main(String[] args) {

        carpma(2,4,6);
        carpma(3, 5);
    }

}

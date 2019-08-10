package asalsayilar;

public class AsalSayilar {

    public static boolean asal(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {
            boolean sonuc = asal(i);
            
            if(sonuc == true){
                System.out.println(i);
            }
            
        }
        
        
    }

}

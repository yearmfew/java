package oop;

public class OOP {

    public static void main(String[] args) {

        araba araba1 = new araba();
        
        araba1.setModel("Audi");
        
        String model = araba1.getModel();
        
        System.out.println(model);
        
        araba1.setTeker(1);
        System.out.println(araba1.getTeker());
    }

}

package oop;

public class araba {

    private String renk;
    private int kapi;
    private int teker;
    private String motor;
    private String model;

    public void setModel(String model) {
        this.model = model;

    }

    public String getModel() {
        return this.model;

    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapi
     */
    public int getKapi() {
        return kapi;
    }

    /**
     * @param kapi the kapi to set
     */
    public void setKapi(int kapi) {

        if (kapi < 0) {
            System.out.println("Kapı değeri sıfırdan az olamaz... ");
        } else {
            this.kapi = kapi;
        }

    }

    /**
     * @return the teker
     */
    public int getTeker() {
        return teker;
    }

    /**
     * @param teker the teker to set
     */
    public void setTeker(int teker) {
        if (teker < 2) {
            System.out.println("Teker değeri 2'den aşağı olamaz...");
        } else {
            this.teker = teker;
        }

    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

}

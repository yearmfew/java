package family;

public class child extends human {

    private String toy;

    child(String name, int age, String toy) {
        super(name, age);
        this.toy = toy;
    }

    public void info() {
        super.info();
        System.out.println("Toy: " + this.toy);
    }

    /**
     * @return the toy
     */
    public String getToy() {
        return toy;
    }

    /**
     * @param toy the toy to set
     */
    public void setToy(String toy) {
        this.toy = toy;
    }

}

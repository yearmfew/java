package family;

public class human {
    
    private String name;
    private int age;

    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void info(){
        System.out.println("Name: " + this.name +
                "\nAge: " + this.age);
        
        
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
}

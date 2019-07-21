package company;

public class worker {

    private String name;
    private String surName;
    private int id;

    public worker(String name, String surName, int id) {

        this.name = name;
        this.surName = surName;
        this.id = id;
    }
    
    public void info(){
        System.out.println("Id: " + id +
                "\nSurname: " + surName + 
                "\n Name:" + name );   
    }

    // get name
    public String getName() {
        return this.name;
    }
    // set name

    public void setName(String name) {
        this.name = name;
    }

    // get surname
    public String getSurName() {
        return this.surName;
    }

    // set surName 
    public void setSurName(String surName){
        this.surName = surName;    
    }
    
    // get id 
    public int getId(){
        return this.id;   
    }
    // set id
    public void setId(int id){
        this.id = id;
    }
    
}

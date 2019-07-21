package family;

public class Family {

    private father father;
    private mother mother;
    private child child;
    private String surName;
    
    public Family(father father, mother mother, child child, String surName) {
        this.father = father;
        this.mother = mother;
        this.child = child;
        this.surName= surName;
    }

    
    public void info(){
        System.out.println("Father: ");
    father.info();
        System.out.println("*************************");
        System.out.println("Mother: ");
    mother.info();
        System.out.println("*************************");
        System.out.println("Child: ");
    child.info();
        System.out.println("*************************");
    
    
    }
    
    
    
    // father get & set
    public father getFather() {
        return this.father;
    }

    public void setFather(father father) {
        this.father = father;
    }

    // mother get & set

    public mother getMother() {
        return this.mother;
    }

    public void setMother(mother mother) {
        this.mother = mother;
    }

    //child get & set

    public child getChild() {
        return this.child;
    }

    public void setChild(child child) {
        this.child = child;
    }

    // surName get && set
    
    public String getSurName(){
        return this.surName;
    }
    public void setSurname(String surName){
        this.surName = surName;
    
    }
}

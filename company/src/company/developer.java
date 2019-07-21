package company;

public class developer extends worker {

    private String ability;

    public developer(String name, String surName, int id, String ability) {

        super(name, surName, id);
        this.ability = ability;
    }

    @Override
    public void info() {
        super.info();

        System.out.println("Ability: " + ability);
        
    }

    // get ability
    public String getAbility() {
        return this.ability;
    }

    // set ability
    public void setAbility(String ability) {
        this.ability = ability;
    }

}

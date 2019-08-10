package company;

public class manager extends worker {

    private int employee;

    public manager(String name, String surName, int id, int employee) {
        super(name, surName, id);
        this.employee = employee;
    }

    public void info(){
        super.info();
        System.out.println("Employee: " + employee);
        
    }
    
    // get employee
    public int getEmployee() {
        return this.employee;
    }

    // set employee
    public void setEmployee(int employee) {
        this.employee = employee;
    }

}

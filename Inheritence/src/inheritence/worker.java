package inheritence;

public class worker {

    private String name;
    private String position;
    private double salary;

    public worker(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public void info() {
        System.out.println("Name: " + this.name
                + "\nPosition: " + this.position
                + "\nSalary: " + this.salary);
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

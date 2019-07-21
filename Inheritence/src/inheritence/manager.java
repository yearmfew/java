package inheritence;

public class manager extends worker {

    private int employee;

    public manager(String name, double salary) {
        super(name, salary);
    }

    public manager(String name, String position, double salary, int employee) {

        super(name, salary);
        setPosition(position);
        this.employee = employee;

    }

    @Override
    public void info() {

        super.info();
        System.out.println("Employee: " + this.employee);

    }

    public int getEmployee() {
        return this.employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

}

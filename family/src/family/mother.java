package family;

public class mother extends human {

    private String job;
    private int salary;
    private String houseWork;

    public mother(String name, int age, String job, int salary, String houseWork) {
        super(name, age);
        this.job = job;
        this.salary = salary;
        this.houseWork = houseWork;

    }

    @Override
    public void info(){
    super.info();
        System.out.println("Job: " + this.job + 
                "\nSalary: " + this.salary + 
                "\nhouseWork: " + this.houseWork);
    }
    
    
    
    
    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHouseWork() {
        return this.houseWork;
    }

    public void setHouseWork(String houseWork) {
        this.houseWork = houseWork;
    }

}

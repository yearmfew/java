
package family;

public class father extends human {
    private String job;
    private int salary;
    
    
    
    public father(String name, int age, String job, int salary){
        super(name, age);
    
        this.job = job;
        this.salary = salary;
        
    }

    @Override
    public void info(){
        super.info();
        
        System.out.println("Job:" + this.job + 
                "\nSalary: " + this.salary);
    
    }
    
    public void work(){
        System.out.println("Baba çalışıyor...");
    }
    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
    
}

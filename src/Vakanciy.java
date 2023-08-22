import java.util.Random;

public class Vakanciy {
    Publisher jobAgency;
    private Random random = new Random();
    Company company;
    //private  int salary;
    private int maxSalary;
    private JobType jobType;

    public Vakanciy(Publisher jobAgency, Company company, JobType jobType) {
        this.jobAgency = jobAgency;
        this.company = company;
        this.jobType = jobType;
    }

    public int getSalary() {
        return maxSalary;
    }

      public void needEmployeeVakanci(){
        int salary = random.nextInt(company.getMaxSalary());
       jobAgency.sendVakanci(company.getName(), jobType, salary);
    }
}
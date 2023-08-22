public class Master implements Observer {

    private String name;
    JobType jobType;
    int salary = 50000;

    public Master(String name, JobType jobType) {
        this.name = name;
        this.jobType = jobType;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Student %s: Мне нужна эта работа! (company: %s; salary: %d)\n", name,
                    nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Student %s: Я найду работу получше! (company: %s; salary: %d)\n", name,
                    nameCompany, salary);
        }
    }

    @Override
    public void receiveVakanc(String nameCompany, JobType jobType, int salary) {
        if (this.jobType == jobType) {
            if (this.salary <= salary) {
                System.out.printf("Master %s: Вканасия %s по моей специальности! УРА, я нашел вакансию мечты! (company: %s; vakanci: %s; salary: %d)\n", name,
                        jobType, nameCompany, jobType, salary);
                this.salary = salary;
            } else {
                System.out.printf("Master %s: Вканасия %s по моей специальности! НЕТ, мне не нужна такая работа - мало денег (company: %s; vakanci: %s; salary: %d)\n", name,
                        jobType, nameCompany, jobType, salary);
            }
        }

    }
}

public class Midle implements Observer{
    String name;
    int salary = 70000;
    JobType jobType;

    public Midle(String name, JobType jobType) {
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
                System.out.printf("Midle %s: Вканасия %s по моей специальности! УРА, я нашел вакансию мечты! (company: %s; vakanci: %s; salary: %d)\n", name,
                        jobType, nameCompany, jobType, salary);
                this.salary = salary;
            } else {
                System.out.printf("Midle %s: Вканасия %s по моей специальности! НЕТ, мне не нужна такая работа - мало денег (company: %s; vakanci: %s; salary: %d)\n", name,
                        jobType, nameCompany, jobType, salary);
            }
        }
        else {
            System.out.printf("Midle %s: Вканасия %s от company: %s это не по моей профессии\n", name,
                    jobType, nameCompany);
        }

    }
}

public interface Observer {

    void receiveOffer(String nameCompany, int salary);

    void receiveVakanc(String nameCompany, JobType jobType, int salary);

}

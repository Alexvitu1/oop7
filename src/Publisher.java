/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendVakanci(String nameCompany, JobType jobType, int salary);

    void registerVakanci(Observer observerVakanc);


}

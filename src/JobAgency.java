import java.util.ArrayList;
import java.util.List;

/**
 * Агенство занимается поиском сотрудников
 */
public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();
    List<Observer> observerVakancs = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendVakanci(String nameCompany, JobType jobType, int salary) {
        for (Observer observerVakanci: observerVakancs) {
            observerVakanci.receiveVakanc(nameCompany, jobType, salary);

        }
    }

    @Override
    public void registerVakanci(Observer observerVakanc) {
        observerVakancs.add(observerVakanc);

    }
}

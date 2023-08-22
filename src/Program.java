public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Publisher jobvakanciy = new JobAgency();
        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);

        Vakanciy testirovshik = new Vakanciy(jobvakanciy, google, JobType.Testirovshik);
        Vakanciy programmist = new Vakanciy(jobvakanciy, yandex, JobType.Programmist);
        Vakanciy economist = new Vakanciy(jobvakanciy, geekBrains, JobType.Economist);
        Vakanciy lawer = new Vakanciy(jobvakanciy, google, JobType.Lawer);

        Master korshunov = new Master("Korshunov", JobType.Testirovshik);
        Student shelkanova = new Student("Shelkanova", JobType.Testirovshik);
        Midle petrov = new Midle("Petrov", JobType.Programmist);
        jobvakanciy.registerVakanci(korshunov);
        jobvakanciy.registerVakanci(shelkanova);
        jobvakanciy.registerVakanci(petrov);

        for (int i = 0; i < 2; i++){
            testirovshik.needEmployeeVakanci();
            programmist.needEmployeeVakanci();
            economist.needEmployeeVakanci();
            lawer.needEmployeeVakanci();
        }


    }

}

public class LabWorker extends Worker{
    String labCity;


    public String getLabCity() {
        return labCity;
    }

    public void setLabCity(String labCity) {
        this.labCity = labCity;
    }

    public LabWorker(String name, int id, int salary, String labCity, String age) {
        super(name, id, salary, age);
        this.labCity = labCity;
    }

    @Override
    public void work() {
        System.out.println("Robie eksperymenty!");
    }

    @Override
    public void askForRise() {
        this.salary += 500;
    }

    @Override
    public String toString() {
        return "LabWorker{" +
                "labCity='" + labCity + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}

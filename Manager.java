public class Manager extends Worker{

    int noPeopleAdministrated;

    public int getNoPeopleAdministrated() {
        return noPeopleAdministrated;
    }

    public void setNoPeopleAdministrated(int noPeopleAdministrated) {
        this.noPeopleAdministrated = noPeopleAdministrated;
    }

    public Manager(String name, int id, int salary, int no, String age) {
        super(name, id, salary, age);
        this.noPeopleAdministrated = no;
    }

    @Override
    public void work() {
        System.out.println("Jestem manadzerem, pracuje i zarzadzam pracownikami");
    }

    @Override
    public void askForRise() {
        salary+= 1000;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "noPeopleAdministrated=" + noPeopleAdministrated +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ITWorker extends Worker{
    String teamName;


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ITWorker(String name, int id, int salary, String teamName, String age) {
        super(name, id, salary, age);
        this.teamName = teamName;
    }

    @Override
    public void askForRise() {
        this.salary += 400;
    }

    @Override
    public void work() {
        System.out.println("Pracuje w biuerze");
    }

    @Override
    public String toString() {
        return "ITWorker{" +
                "teamName='" + teamName + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }


}

public abstract class Worker extends Person implements WorkerInterface{

    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker(String name, int id, int salary, String age) {
        super(name, id);
        this.salary = salary;
        this.age = age;
    }

    public abstract void work();


}

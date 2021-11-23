public class ProductionWorker extends Worker{
    enum ProductionTask {
        DRIVER,
        BUILDER,
        ARCHITECT,
    }

    private ProductionTask productionTask;

    public ProductionTask getProductionTask() {
        return productionTask;
    }

    public void setProductionTask(ProductionTask productionTask) {
        this.productionTask = productionTask;
    }

    public ProductionWorker(String name, int id, int salary, ProductionTask productionTask, String age) {
        super(name, id, salary, age);
        this.productionTask = productionTask;
    }

    @Override
    public void work() {
        System.out.println("Jestem zwyklym pracownikiem, pracuje w pocie czola!");
    }

    @Override
    public void askForRise() {
        salary += 0; // :(
    }

    @Override
    public String toString() {
        return "ProductionWorker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", productionTask=" + productionTask +
                ", salary=" + salary +
                '}';
    }
}

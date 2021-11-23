public class Executive extends Person{

    private FieldOfExpertise fieldOfExpertise;
    private static int peopleFired = 0;

    public static void fireSomeone() {
        peopleFired++;
    }

    enum FieldOfExpertise {
        CEO,
        CTO,
        CMO,
        CFO
    }

    public FieldOfExpertise getFieldOfExpertise() {
        return fieldOfExpertise;
    }

    public void setFieldOfExpertise(FieldOfExpertise fieldOfExpertise) {
        this.fieldOfExpertise = fieldOfExpertise;
    }

    public Executive(String name, int id, FieldOfExpertise fieldOfExpertise, String age) {
        super(name, id);
        this.fieldOfExpertise = fieldOfExpertise;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "fieldOfExpertise=" + fieldOfExpertise +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                '}';
    }
}

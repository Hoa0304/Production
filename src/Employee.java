// nhan vien
// công việc : work
public class Employee extends Cadres{
    private String work;

    public Employee(String name, int age, String sex, String address, String work) {
        super(name, age, sex, address);
        this.work = work;
    }

    public Employee() {
        super();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+ " Work : "+work;
    }
}

//cong nhan
// bậc : step
public class Worker extends Cadres{
    private int step;

    public Worker(String name, int age, String sex, String address, int step) {
        super(name, age, sex, address);
        this.step = step;
    }

    public Worker() {
        super();
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Step : "+step;
    }
}

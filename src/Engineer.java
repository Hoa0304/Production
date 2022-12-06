// ky su
// ngành đào tạo : training industry
public class Engineer extends Cadres{
    private String training_industry;

    public Engineer(String name, int age, String sex, String address, String training_industry) {
        super(name, age, sex, address);
        this.training_industry = training_industry;
    }

    public Engineer() {
        super();
    }

    public String getTraining_industry() {
        return training_industry;
    }

    public void setTraining_industry(String training_industry) {
        this.training_industry = training_industry;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+ "Traning industry : "+training_industry;
    }
}

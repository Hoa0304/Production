// Production Unit : don vi san xuat
// Cadres : can bo
public class Cadres {
    private String name;
    private int age;
    private String sex;
    private String address;

    public Cadres() {
    }

    public Cadres(String name, int age, String sex, String address){
        this.address= address;
        this.sex= sex;
        this.age= age;
        this.name= name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

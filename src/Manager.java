// quan ly
//Thêm mới cán bộ : add new staff
//Tìm kiếm theo họ tên : search by name
//Hiển thị thông tin về danh sách các cán bộ : display information about the cadres list
//Thoát khỏi chương trình : exit the program
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    private List<Cadres> staff;
    public Manager(){
        this.staff= new ArrayList<>();
    }
    // 1. Add new staff
    public void add(Cadres cadres){this.staff.add(cadres);}
    //2.Search by name
    public List<Cadres> searchStaffByName(String name){
        return this.staff.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    //3. Display information about the cadres list
    public void show(){this.staff.forEach(p->System.out.println(p.toString()));}
}


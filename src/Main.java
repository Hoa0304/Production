import java.util.Scanner;

public class Main {
    static void Menu() {
        System.out.println("===================CH Tran====================");
        System.out.println("|1.Add new staff                             |");
        System.out.println("|2.Search by name                            |");
        System.out.println("|3.Display information about the cadres list |");
        System.out.println("|4.Exit the program                          |");
        System.out.println("=====================22ITe====================");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner input = new Scanner(System.in);
        int choose = 0;
        do {
            Menu();
            System.out.println("| Choose :                                   |");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("*  Enter a: to insert Enginner                  |");
                    System.out.println("*  Enter b: to insert Worker                    |");
                    System.out.println("*  Enter c: to insert Staff                     |");
                    String type = input.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = input.nextLine();
                            System.out.print("Enter age:");
                            int age = input.nextInt();
                            System.out.print("Enter gender: ");
                            input.nextLine();
                            String sex = input.nextLine();
                            System.out.print("Enter address: ");
                            String address = input.nextLine();
                            System.out.print("Enter branch: ");
                            String training_industry = input.nextLine();
                            Cadres engineer = new Engineer(name, age, sex, address, training_industry);
                            manager.add(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Enter name: ");
                            String name = input.nextLine();
                            System.out.print("Enter age:");
                            int age = input.nextInt();
                            System.out.print("Enter gender: ");
                            input.nextLine();
                            String sex = input.nextLine();
                            System.out.print("Enter address: ");
                            String address = input.nextLine();
                            System.out.print("Enter level: ");
                            int step = input.nextInt();
                            Cadres worker = new Worker(name, age, sex, address, step);
                            manager.add(worker);
                            System.out.println(worker.toString());
                            input.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter name: ");
                            String name = input.nextLine();
                            System.out.print("Enter age: ");
                            int age = input.nextInt();
                            System.out.print("Enter gender: ");
                            input.nextLine();
                            String sex = input.nextLine();
                            System.out.print("Enter address: ");
                            String address = input.nextLine();
                            System.out.print("Enter task: ");
                            String work = input.nextLine();
                            Employee staffs = new Employee(name, age, sex, address, work);
                            manager.add(staffs);
                            System.out.println(staffs.toString());
                            break;
                        }
                        default:
                            System.err.println("Invalid");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String name = input.nextLine();
                    manager.searchStaffByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;

                case 3: {
                    manager.show();
                    break;
                }
                case 4:
                    System.out.println("YEU HOA");
                    break;
                default:
                    System.err.println("Invalid");
                    continue;

            }
        }while (choose != 4) ;
    }
}
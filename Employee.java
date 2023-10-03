import java.util.*;
import java.util.UUID;
public class Employee extends showroom implements utility{
    String empId;
    String empname;
    int empage;
    String empDepartment;
    String showroon_name;

    public void get_details(){
        System.out.println("ID:" +empId);
        System.out.println("Employee Name"+empname);
        System.out.println("Employee age" +empage);
        System.out.println("Employee Department" +empDepartment);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empId = String.valueOf(uuid);
        System.out.println("***************** Employee Details ******************");
        System.out.println();
        System.out.println("Employee Name");
        empname =sc.nextLine();
        System.out.println("Employee Age");
        empage =sc.nextInt();
        System.out.println("Employee Deparrtment");
        empDepartment=sc.nextLine();
        System.out.println("Showroon Name");
        showroon_name =sc.nextLine();
    }
}

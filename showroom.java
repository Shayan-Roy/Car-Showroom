import java.util.*;
import java.sql.SQLOutput;
public class showroom implements utility {
    String Showroom_name;
    String showroom_address;
    String manager_name;
    int total_emp;
    int total_car_in_stock=0;

    public void get_details(){
        System.out.println("Showroom name:"+Showroom_name);
        System.out.println("Showroom Address" +showroom_address);
        System.out.println("Manager Name" +manager_name);
        System.out.println("Total Employee" +total_emp);
        System.out.println("Total car in stock:"+ total_car_in_stock);
    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("************** Enter Showroom Details ******************");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        Showroom_name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_emp = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_car_in_stock = sc.nextInt();
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

interface utility{
    public void get_details();
    public void set_details();
}
public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        showroom Showroom[] = new showroom[5];
        Cars car[] = new Cars[5];
        Employee employee[] =new Employee[5];
        int car_counter=0;
        int showroom_counter=0;
        int employee_counter=0;
        int choice=100;
        while(choice!=0) {
            main_menu();
            choice = sc.nextInt();
            while(choice !=0 && choice!=9){
                if (choice == 1){
                    Showroom[showroom_counter]=new showroom();
                    Showroom[showroom_counter].set_details();
                    showroom_counter++;
                    System.out.println("1. Add New showroom");
                    System.out.println("9. Go Back to Main Menu");
                    choice =sc.nextInt();

                } else if (choice ==2) {
                    employee[employee_counter]=new Employee();
                    employee[employee_counter].set_details();
                    employee_counter++;
                    System.out.println("2. Add new emplyee");
                    System.out.println("9. Go back to main menu");
                    choice=sc.nextInt();

                } else if (choice ==3) {
                    car[car_counter]=new Cars();
                    car[car_counter].set_details();
                    car_counter++;
                    System.out.println("3. Add more cars");
                    System.out.println("9. Go back to main menu");
                    choice=sc.nextInt();
                } else if (choice ==4) {
                    for (int i =0; i< showroom_counter;i++)
                    {
                       Showroom[i].get_details();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9. Go back to main menu");
                    System.out.println("0. Exit");
                    choice=sc.nextInt();
                } else if (choice == 5) {
                    for (int i=0;i<employee_counter;i++)
                    {
                        employee[i].get_details();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9.Go back to main menu");
                    System.out.println("0. Exit");
                } else if (choice ==6) {
                    for (int i=0;i<car_counter;i++)
                    {
                        car[i].get_details();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9.Go Back to main menu");
                    System.out.println("0.Exit");
                    choice=sc.nextInt();

                }
                else {
                    System.out.println("please press the correct key");
                }
            }
        }
    }
}
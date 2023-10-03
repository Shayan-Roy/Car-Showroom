import java.util.*;
public class Cars extends showroom implements utility {
    String carname;
    String carcolour;
    String fueltype;
    String cartype;
    float carPrice;
    String cartransmission;

    @Override
    public void get_details() {
        System.out.println("Car Name:" +carname);
        System.out.println("Car Colour" + carcolour);
        System.out.println("Fuel Type" +fueltype);
        System.out.println("Car Price"+carPrice);
        System.out.println("Car Type:" +cartype);
        System.out.println("Transmission"+ cartransmission);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("******* Car Details *********");
        System.out.println();
        System.out.print("Car Name:");
        carname =sc.nextLine();
        System.out.print("Car Colour");
        carcolour = sc.nextLine();
        System.out.print("Fuel Type:");
        fueltype = sc.nextLine();
        System.out.print("Car Price");
        carPrice =sc.nextFloat();
        System.out.print("Car Type");
        cartype =sc.nextLine();
        System.out.print("Transmission type(Automatic /Manual)");
        cartransmission=sc.nextLine();;
        total_car_in_stock++;

    }
}

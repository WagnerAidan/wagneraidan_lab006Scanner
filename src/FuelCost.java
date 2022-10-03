import java.util.Scanner;
public class FuelCost {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the number of gallons in a full tank");
        double gal = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Please enter the Miles Per Gallon");
        double mpg = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Please enter the price of gas per gallon");
        double price = c.nextDouble();
        double distance = gal * mpg;
        double finalPrice = price * 100;
        System.out.println("You can travel a total of " + distance + " miles on a full tank of gas");
        System.out.println("Your cost of driving 100 miles would be " + finalPrice);
    }

}

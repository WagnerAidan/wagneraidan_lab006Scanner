import java.util.Scanner;
public class Metric {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter a measurement in meters");
        double measurement = a.nextDouble();
        double inches = measurement * 39.37;
        double miles = measurement / 1609 ;
        double feet = measurement * 3.281 ;
        System.out.println("Your measurement in feet is " + feet + " feet!");
        System.out.println("Your measurement in inches is " + inches + " Inches!" );
        System.out.println("Your measurement in miles is " + miles + " Miles!");
    }

}

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celcius");
        double celcius = in.nextDouble();
        double farenheit = celcius * 9/5 + 32;
        System.out.println("Your estimated temperature in Farenheit is: " + farenheit);

    }

}

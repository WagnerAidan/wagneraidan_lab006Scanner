import java.util.Scanner;
public class RectInfo {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the Length of side A");
        double sideA = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Please enter the length of side B");
        double sideB = b.nextDouble();
        double area = sideA * sideB;
        double perimeter = sideA + sideA + sideB + sideB;
        System.out.println("The area is " + area );
        System.out.println("The perimeter is " + perimeter);
    }

}

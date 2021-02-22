import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi, r, a;
        
        System.out.print("Enter Rdius: ");
        r = scan.nextDouble(); // Radius of the circle
        pi = 3.1416; // Value of pi approx.
        a = pi * r * r; // Computing the area

        System.out.println("Area of circle: " + a);

        scan.close();
    }
}

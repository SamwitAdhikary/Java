import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        int c = a + b;
        System.out.println("Sum: " + c);
        scan.close();
    }
}

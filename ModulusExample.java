import java.util.Scanner;
public class ModulusExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        try {
            int result = a % b;   // may throw ArithmeticException if b == 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Modulus by zero is not allowed!");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        int result = (num1>num2)?num1:num2;

        System.out.println(result);
    }
}

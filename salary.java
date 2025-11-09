import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int age = scan.nextInt();
        System.out.print("Enter your salary:");
        int salary = scan.nextInt();

        if (age <= 25 || salary >= 20000){
            System.out.println("You are eligible for loan");
            System.out.print("Enter your needed loan amount:");
            int input_salary = scan.nextInt();

            if (input_salary >=50000) {
                System.out.println("Maximum loan amount is 50000!");
                
            }else{
                System.out.println("Loan is available!!");
            }

        }else{
            System.out.println("You are not eligible for loan :)");
        }
    }
}

import java.util.Scanner;

public class average_class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double s1 = scan.nextInt();
        double s2 = scan.nextInt();
        double s3 = scan.nextInt();
        double s4 = scan.nextInt();
        double s5 = scan.nextInt();
        
        double average = (s1+s2+s3+s4+s5)/5;

        if (average < 35) {
            System.out.println("Additional class is required");
        }else{
            System.out.println("you are good to go");
        }
    }
}

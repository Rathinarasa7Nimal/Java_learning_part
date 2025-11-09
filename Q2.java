import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Name = scan.nextLine();
        Double marks = scan.nextDouble();
        scan.nextLine();
        String Department = scan.nextLine();

        System.out.println("My Name is " + Name);
        System.out.println( "My Score is "+ marks/10+"/10");
        System.out.println("My Department is "+ Department);
    }
    
}
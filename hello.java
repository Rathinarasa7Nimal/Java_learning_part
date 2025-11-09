import java.util.Scanner;

class hello {
    public static void main(String args[]) {
        Scanner John = new Scanner(System.in);
        String Name = John.nextLine();
        int Age =John.nextInt();
        John.nextLine();
        String Address = John.nextLine();
        System.out.println("My name is" + Name);
        System.out.println("My age is " + Age);
        System.out.print("My Address is " +Address);
    }
}

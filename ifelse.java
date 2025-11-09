import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String Meghana = scanner.nextLine();

        if (Meghana.equals("dead")) {
            System.out.println("Surya meets Ramya");
        }else{
            System.out.println("Surya weds meghana");
        }
    }
}

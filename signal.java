import java.util.Scanner;

public class signal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String color_Signal = scan.nextLine();

        if (color_Signal.equals("red")) {
            System.out.println("Stop");
        }else if (color_Signal.equals("yellow")){
            System.out.println("get Ready");
        }else {
            System.out.println("Go");
        }
    }
}

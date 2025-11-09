import java.util.Scanner;

public class numberdivisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a =3;
        int b =5;
        int input = scan.nextInt();

        boolean condtion1 = (input % a == 0);
        boolean condtion2 = (input % b == 0);
        if ( condtion1 && condtion2 ) {
            System.out.println("Number is divisible by both 3 and 5");
        }else{
            System.out.println("not divisible by 3 and 5");
        }
    }
}

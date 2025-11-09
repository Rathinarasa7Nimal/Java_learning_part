import java.util.Scanner;

public class challange2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        if (score < 50) {
            System.out.println("You need to improve");
        }else if (score > 49 && score < 71) { //score == 50 || SCORE > 50 && SCORE < 70
            System.out.println("Good job! ");
        }else{
            System.out.println("Excellent performance");
        }
    }
}

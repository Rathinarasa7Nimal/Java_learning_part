import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // System.out.print("enter the starting no :");
        // int a = scan.nextInt();
        // System.out.print("enter the ending no2 :");
        // int b = scan.nextInt();
// 
        // for(int i = a; i<=b;i++){
            // System.out.println("               "+i);
        // }
        // int count = 0;
        // for (int i = 1 ; i<=10; i++){
            // if (i%2!=0) {
                // System.out.println(i);
                // count = count +1;
            // }
        // }
        // System.out.println(count);

        for (int i = 1; i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}

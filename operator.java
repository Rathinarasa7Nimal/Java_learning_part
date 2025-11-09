import java.util.Scanner;

class operator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 == num2 ){
            System.out.print("num1 is equal to num2");
        }else
        {
            System.out.print("num1 is not equal to num2");
        }
    }
}
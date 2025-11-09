import java.util.Scanner;

public class printpass {
    public static void main(String[] args) {
        
    
     Scanner scan = new Scanner(System.in);

     int mark = scan.nextInt();

     if (mark > 34){
        System.out.println("pass");
     }else{
        System.out.println("fail");
     }
}

}
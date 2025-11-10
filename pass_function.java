// import java.text.ListFormat.Style;
import java.util.Scanner;

public class pass_function {
    String getrestult(int score){
        if(score < 34){
            return "fail";
        }else{
            return "pass";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        pass_function result = new pass_function();

        String output = result.getrestult(score);

        System.out.println(output);
    }
}

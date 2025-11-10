import java.util.Scanner;

public class array_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int[] num_array = new int[5];

        // for(int i =0; i<=4; i++){
        //     num_array[i]=scan.nextInt();
        // }


        // //Print entered numbers`
        // for(int i =0; i<=4; i++){
        //     System.out.println(num_array[i]);
        // }
        
        // System.out.println("enter the size of array: ");
        // int size_array = scan.nextInt();

        // int[] array_num = new int[size_array];

        // System.out.println("enter  the array numbers:");
        // for(int i =0; i<=size_array-1; i++){
        //     array_num[i]=scan.nextInt();
        // }

        // System.out.println("middle number of array is : "+array_num[size_array/2]);

        // star printing

        for(int i =0; i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

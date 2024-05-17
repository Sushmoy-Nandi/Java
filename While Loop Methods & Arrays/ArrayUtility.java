import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] ar = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements no " + (i+1)+": ");
            ar[i]=input.nextInt();
            i++;
        }
        return ar;
    }
}

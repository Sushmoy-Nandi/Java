import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Maximum Minimum");
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] ar = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements no " + (i+1)+": ");
            ar[i]=input.nextInt();
            i++;
        }
        input.close();
        int maximum=Max(ar);
        System.out.println("Maximum element is: "+ maximum);
        int minimum=Min(ar);
        System.out.println("Minimum element is: "+ minimum);
    }
    public static int Max(int[] ar){
        int max=ar[0];
        int i=0;
        while(i<ar.length){
            if(ar[i]>max)
            {
                max=ar[i];
            }
            i++;
        }
        return max;
    }
    public static int Min(int[] ar){
        int min=ar[0];
        int i=0;
        while(i<ar.length){
            if(ar[i]<min)
            {
                min=ar[i];
            }
            i++;
        }
        return min;

    }
}

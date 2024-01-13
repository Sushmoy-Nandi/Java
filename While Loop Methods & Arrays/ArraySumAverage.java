import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Array Sum Average\n");
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
        long sum=sumof(ar);
        double avg=averageof(ar);
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + avg);
    }
    public static long sumof(int[] ar){
        long sum=0;
        int i=0;
        while(i<ar.length){
            sum=sum+ar[i];
            i++;
        }
        return sum;
    }
    // public static double averageof(int[] ar){
    //     double sum=0;
    //     int i=0;
    //     while(i<ar.length){
    //         sum=sum+ar[i];
    //         i++;
    //     }
    //     double avg=sum/ar.length;
    //     return avg;
    // }
    public static double averageof(int[] ar) {
        double sum = sumof(ar);
        return (sum / ar.length);
    }

}

import java.util.Scanner;

public class ArrayOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrence");
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        int[] ar = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the elements no " + (i+1)+": ");
            ar[i]=input.nextInt();
            i++;
        }
        System.out.print("Now enter the number you want to find: ");
        int num=input.nextInt();
        input.close();
        int occurrence=arrayoccurence(ar, num);
        System.out.println("Your elements was found " +occurrence+" times in array");
    }

    public static int arrayoccurence(int[] ar , int num){
        int occ=0;
        int i=0;
        while(i<ar.length){
            if(ar[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}

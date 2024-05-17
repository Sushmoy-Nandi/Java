import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar={10,20,30,40,50,60,70,80};
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number you want to search: ");
        int num =input.nextInt();
        boolean isFound=arraysearching(ar, num);
        if(isFound){
            System.out.println("Your number was found in array");
        }else{
            System.out.println("Your number was not found in array");
        }
        input.close();

    }
    public static boolean arraysearching(int[] ar, int num ){
        int index =0;
        while(index<ar.length){
            if(ar[index]==num){
            return true;
        }
        index++;
        }
        return false;
    }
}

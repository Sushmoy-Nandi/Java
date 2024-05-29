package problem5;

import java.util.Scanner;

public class ArithmeticArrayIndexOutOfBoundexception {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int first=input.nextInt();
        System.out.println("Please enter first number: ");
        int second =input.nextInt();
        try{

            int result =first/second;
            System.out.printf("Result is %d",result);
            int[] a = new int[5];
            a[6] = first/second;
            System.out.printf("Result is %d",a[6]);

        }catch (ArithmeticException exception){
            System.out.printf("%s, enter valid values",exception.getMessage());
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("\nArray is out of bound.");
        }
    }
}

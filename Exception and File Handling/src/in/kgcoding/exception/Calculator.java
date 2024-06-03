
package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }
    private  static void a(){
        b();
    }
    private  static void b(){
        c();
    }
    private  static void c(){
        d();
    }
    private  static void d(){
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter your number: ");
        int first=input.nextInt();
        int second =input.nextInt();
        try{
            int[] a = new int[5];
            //System.out.printf("Result is %d",a[6]);
            a[6] = first/second;
            //System.out.printf("Result is %d",a[6]);

        }catch (ArithmeticException exception){
            System.out.printf("%s, enter valid values",exception.getMessage());
            // System.out.println("Divided by zero, enter valid values");
//        }catch (ArrayIndexOutOfBoundsException exc){
//            System.out.println("Array is out of bound.");
        }catch(Throwable th){
            System.out.println("General Exception.");
            throw th;
        }finally {
            System.out.println("I am in finally ");

        }

    }
}

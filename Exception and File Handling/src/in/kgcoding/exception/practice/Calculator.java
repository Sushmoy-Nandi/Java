package in.kgcoding.exception.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Calculator\n");
        System.out.print("Enter first number: ");
        int first=input.nextInt();
        System.out.println("Now, the second number");
        int second=input.nextInt();
        try{
            int result =first/second;
            System.out.printf("Result is %d",result);
        }catch(ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Divided by zero occured.");
            }else {
                throw exception;
            }
        }

    }
}

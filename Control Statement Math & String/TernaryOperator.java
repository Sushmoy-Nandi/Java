import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please ener your firs number: ");
        int num1=input.nextInt();
        System.out.println("Now, enter he second number: ");
        int num2=input.nextInt();


        if(num1>num2){
            System.out.println(num1 + " is the greatest number");

        }else{
            System.out.println(num2 + " is the greatest number");

        }
    }
}

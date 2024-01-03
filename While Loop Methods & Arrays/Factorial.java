import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Welcome to factorial Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =input.nextInt();
        input.close();

        long factorial= factorialNum(num);

        System.out.println( num + " Factorial is " + factorial);
    }
    public static long factorialNum(int num){

        if(num <2){
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=num)
        {
            fact= fact*i;
            i++;
        }
        return fact;
    }
}

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World");
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("Sum is: " + sum);
        input.close();
    }
    public static int sumofdigits(int num){
        int sum=0;
        while(num>0)
        {
            sum=sum+ num%10;
            num= num/10;
        }
        return sum;
    }
}

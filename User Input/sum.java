import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: ");
        
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();

        int sum =firstNumber+secondNumber;
        System.out.println("Sum is: " + sum);
    }
}

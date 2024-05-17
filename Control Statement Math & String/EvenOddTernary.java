import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the finding even or odd: ");
        System.out.println("Enter the number: ");
        int num=input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";

        System.out.println("Your result is: "+result);

    }
}

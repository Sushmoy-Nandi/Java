import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two number: ");

        int num1= input.nextInt();
        int num2= input.nextInt();

        int bitwiseand=num1 & num2;
        System.out.println(bitwiseand);
    }
    
}

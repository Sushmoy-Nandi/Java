import java.util.Scanner;

public class GreatestThreeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter 1st Number: ");
            int num1=input.nextInt();
            System.out.print("Enter 2nd Number: ");
            int num2=input.nextInt();
            System.out.print("Enter 3rd Number: ");
            int num3=input.nextInt();

            if(num1>=num2 && num1>=num3){
                System.out.println("The greatest number is: " +num1);
            }else if(num2>=num1 && num2>=num3){
                System.out.println("The greatest number is: "+num2);
            }else{
                System.out.println("The greatest number is: "+num3);
            }
        }
    
    }
}

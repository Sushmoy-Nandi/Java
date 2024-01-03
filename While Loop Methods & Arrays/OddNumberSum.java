import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the odd number sum calculator");
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int sum=sumOddNumber(num);
        System.out.println("OddSum till " + num + " is " +sum);
        input.close();
    }

    public static int sumOddNumber(int num){
        int sum=0;
        int i=1;
        while (i<=num) {
            sum=sum+i;
            i+=2;
        }
        return sum;
    }

}

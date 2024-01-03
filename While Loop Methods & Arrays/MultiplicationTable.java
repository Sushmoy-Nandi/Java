import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World");
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        multiplication(num);
        input.close();
    }
    public static void multiplication(int num){

        int i=1;
        while (i<=10) {
            System.out.println(num + " X " + i + " = " + num*i );
            i++;
        }
        

    }
}

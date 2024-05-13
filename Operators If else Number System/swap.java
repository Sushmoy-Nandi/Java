import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter two number: ");
            
            int a= input.nextInt();
            int b= input.nextInt();

            // swaping
            int temp =a;
            a=b;
            b=temp;

            System.out.println(a);
            System.out.println(b);
        }

}

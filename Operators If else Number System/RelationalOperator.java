import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Driving Lince Portal");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            int age =input.nextInt();

            if( age>=18){
                System.out.println("You are eligiable");
            }else {
                System.out.println("Vai tui Cycle chala");
            }
        }
    }
    
}

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcom to ticket portal");

            System.out.print("Enter your age: ");
            int age =input.nextInt();
            
            System.out.println("Are you female ?");
            boolean isFemale =input.nextBoolean();

            if(age<5){
                System.out.println("You will get 75% discount");
            }else if(isFemale){
                System.out.println("You will get 50% discount");
            }else if(age>60 && !isFemale){
                System.out.println("You will get 25% duscount");
            }else {
                System.out.println("You will not get any discount");
            }
        }
    }
    
}

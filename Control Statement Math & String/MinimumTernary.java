import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the finding Minimum");
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2=input.nextInt();

        MinimumTernary ternary=new MinimumTernary();

        int min=ternary.Minimum(num1,num2);

        System.out.println("Minimum Number is: "+min);
    }


    public int Minimum(int num1,int num2){
        // using ternary
        return num1<num2 ? num1:num2;
        // if(num1<num2) {
        //     return num1;
        // }
        // else{
        //     return num2;
        // }
    }
    
}

import java.util.Scanner;

public class ProductFlotingPointNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float a= input.nextFloat();
            float b= input.nextFloat();

            float product = a*b;

            System.out.println(product);
        }

    }
}

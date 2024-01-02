public class Parameter {
    public static void main(String[] args) {
        int summation=sumTwoNumber(3,5);
        System.out.println("Sum of the number is: " + summation);
    }

    public static int sumTwoNumber(int a,int b){
        System.out.println("first number received: " + a);
        System.out.println("second number received: " + b);

        int sum=a+b;
        return sum;
    }
}

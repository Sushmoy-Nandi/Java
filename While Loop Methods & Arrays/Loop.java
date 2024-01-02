import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        // int num=1;
        // while(num<=100){
        //     System.out.println(num);
        //     num=num+1;
        // }

        // int count=500;
        // while(count>=200){
        //     System.out.println(count);
        //     count=count-1;
        // }

        try (Scanner input = new Scanner(System.in)) {
            int i=0;
            while (i<5) {
                System.out.println("Enter the number: ");
                int inp=input.nextInt();
                System.out.println("Number is: " + inp);
                i++;
            }
        }
    }
}
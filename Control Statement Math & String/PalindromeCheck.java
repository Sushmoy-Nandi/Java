import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str =input.nextLine();
        int length=str.length();
        boolean isPalindrome=true;
        int i=0,j=length-1;
        for(i=0;i<length;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}

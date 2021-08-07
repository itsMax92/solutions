import java.util.Scanner;

public class Palindrome {

    static void checkPalindrome(String input){

        Boolean result = true;
        int length = input.length();
        for (int i=0; i<=length/2 ; i++){
            if (input.charAt(i) != input.charAt(length-i-1)){
                result = false;
                break;
            }
        }
        if (result){
            System.out.println(input + " is a palindrome ||" +result);
        }
        else{
            System.out.println(input + " is not a palindrome ||" +result);
        }
    }
    public static void main(String... agrs){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Statement: ");
        String str = scan.nextLine();

        checkPalindrome(str);

    }

}

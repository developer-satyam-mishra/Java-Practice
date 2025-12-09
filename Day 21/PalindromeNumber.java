import java.util.Scanner;
class PalindromeNumber{
    public static void main(String[]args){
        int number = 25252;
        int temp = number;
        int result = 0;
        while (temp != 0){
            int rem = temp % 10 ;
            result = result*10 + rem;
            temp = temp/10;
            }
            System.out.println("Palindrome number " +result);
    }        
}    
import java.util.Scanner;
class Vowel{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Alphabet: ");
        char alpha=scan.next().charAt(0);
        if ( alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' || alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U' ){
            System.out.print("It is a vowel");
        }else{
            System.out.print("It is a constant");
        }
    }
}
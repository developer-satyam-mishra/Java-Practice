import java.util.Scanner;
class UserMultiplication{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a =scan.nextInt();
        System.out.println("Enter your second number");
        int b = scan.nextInt();
        int c = a*b;
        System.out.println("Multiplication of two numbers are " +c);
    }
}
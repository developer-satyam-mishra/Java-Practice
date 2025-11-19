import java.util.Scanner;
class UserAddition{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=scan.nextInt();
        System.out.print("Enter second number : ");
        int b=scan.nextInt();
        int c=a+b;
        System.out.println("Sum of two numbers are "+c);
    }
}
import java.util.Scanner;
class   UserDivision{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=scan.nextInt();
        System.out.println("Enter your second number");
        int b=scan.nextInt();
        int c=a/b;
        System.out.println("Division of two numbers are " +c);


    }
}
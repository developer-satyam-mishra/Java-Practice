import java.util.Scanner;
class Calculator{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        float num1=scan.nextFloat();
        System.out.print("Enter second number : ");
        float num2=scan.nextFloat();
        float add=num1+num2;
        float sub=num1-num2;
        float multi=num1*num2;
        float div=num1/num2;
        System.out.println("Addition of two number is  : "+add);
        System.out.println("Subtraction of two number is  : "+sub);
        System.out.println("Multiplication of two number is  : "+multi);
        System.out.print("Division of two number is  : "+div);
    }
}
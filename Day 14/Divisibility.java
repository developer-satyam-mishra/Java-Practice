import java.util.Scanner;

class Divisibility{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int dividend=scan.nextInt();
        System.out.print("Enter second number : ");
        int divisior=scan.nextInt();
        if (dividend%divisior==0){
            System.out.print("Number is divisible");
        }else{
            System.out.print("Number is not divisible");
        }
    }
}
import java.util.Scanner;
class NumberType{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num1=scan.nextInt();
        if (num1==0){
            System.out.print("Number is Zero ");
        }else if(num1==-num1){
            System.out.print("Number  is Negative ");
        }else {
            System.out.print("Number is Positive ");
        }
    }
}
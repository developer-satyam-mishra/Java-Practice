import java.util.Scanner;
class EqualNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter second number : ");
        int num2=scan.nextInt();
        if(num1==num2){
            System.out.println("Number is Equal ");
        }else{
            System.out.print("Number is not Equal ");
        }
    }
}

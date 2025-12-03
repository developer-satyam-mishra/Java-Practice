import java.util.Scanner;
class LastDigits{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter the second number : ");
        int num2=scan.nextInt();
        System.out.print("Enter the third number : ");
        int num3=scan.nextInt();
        if(num1%10==num2%10 && num2%10==num3%10 && num3%10==num1%10){
            System.out.print("All three numbers have the same last digits");
        }else{
            System.out.print("All three numbers have not the same last digits");
        }
    }
}
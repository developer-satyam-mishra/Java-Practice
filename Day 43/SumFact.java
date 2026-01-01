import java.util.Scanner;
class FactSum{
    public static void main(String [] args ){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the first n number: ");
        int num1=scan.nextInt();
        System.out.print("Enter the second n number: ");
        int num2=scan.nextInt();
        int sum=0;
        for (int i=num1;i<=num2;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            sum+=fact;
        }
        System.out.print("Sum of factorial of n number between interval is : "+sum);
    }
}
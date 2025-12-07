import java.util.Scanner;
class SumSquare{
    public static void main(String[]args){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the n number : ");
        double num=scan.nextInt();
        double sum=0;
        for(double i=1;i<=num;i++){
            sum=sum+Math.pow(i,2);
        }
        System.out.print("Sum of n Natural Number is : "+sum);
    }
}
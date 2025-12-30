import java.util.Scanner;
class SumFibonacci{
    public static void main(String [] args ){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the number of series : ");
        int series=scan.nextInt();
        int a =0;
        int b =1;
        int sum=a+b;
        for (int i =3;i<=series;i++){
            int temp=a+b;
            a=b;
            b=temp;
            sum=sum+temp;
        }
        System.out.println("Sum of fibonnacci series is : "+sum);
         
    }
}
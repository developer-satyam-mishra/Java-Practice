import java.util.Scanner;
class Fibonacci{
    public static void main(String [] args ){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the number of series : ");
        int series=scan.nextInt();
        int a =0;
        int b =1;
        System.out.print("Fibonacci series are "+a+","+b+",");
        for (int i =3;i<=series;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+",");
        }
         
    }
}
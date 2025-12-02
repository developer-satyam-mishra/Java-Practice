import java.util.Scanner;
class EvenOdd{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.print("Number is even");
        }else{
            System.out.print("Number is odd");
        }
    }
}
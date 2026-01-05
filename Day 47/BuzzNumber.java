import java.util.Scanner;
class BuzzNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        if(temp%7==0){
            System.out.print("It is a Buzz Number");
        }else if(temp%10==7){
            System.out.print("It is a Buzz Number");
        }else{
            System.out.print("It is a not Buzz Number");
        }
    }
}
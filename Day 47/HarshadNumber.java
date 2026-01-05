import java.util.Scanner;
class HarshadNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        int result=0;
        while (temp!=0) {
            int remainder = temp % 10 ;
            result = result + remainder;
            temp = temp/10;
        }if(num%result==0){
            System.out.print("It is a Harshad Number");
        }else{
            System.out.print("It is a not Harshad Number");
        }
    }
}
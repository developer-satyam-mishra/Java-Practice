import java.util.Scanner;
class UglyNumber{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        while(temp%2==0){
            temp=temp/2;
        }
        while(temp%3==0){
            temp=temp/3;
        }  
        while(temp%5==0){
            temp=temp/5;
        }
        if(temp==1){
            System.out.print("It is Ugly Number");
        }else{
            System.out.print("It is not Ugly Number");
        }
    }
}
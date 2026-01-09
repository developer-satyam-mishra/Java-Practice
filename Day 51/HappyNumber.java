import java.util.Scanner;
class HappyNumber{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>9){
             int no=temp;
             while(no!=0){
                int remainder=no%10;
                sum=sum+(remainder*remainder);
                no=no/10;
            }
            temp=sum;
            sum=0;
        }
        if (temp == 1){
            System.out.print("It is Happy Number");
        }else{
            System.out.print("It is not Happy Number");
        }
    }
}
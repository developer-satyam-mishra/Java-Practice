import java.util.Scanner;
class MagicNumber{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>9){
            int no=temp;
            while(no!=0){
                int rem=no%10;
                sum=sum+rem;
                no=no/10;
                temp=sum;
            }      
        }
        if(sum==1){
            System.out.print("It is Magic number");
        }else{
            System.out.print("It is not Magic number");
        }
    }
}
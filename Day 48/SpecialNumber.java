import java.util.Scanner;
class SpecialNumber{
    public static void main(String [] args ){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        int result=0;
        int sum=0;

        while(temp!=0){
            int remainder=temp%10;
        
            int fact=1;
            for(int i=1;i<=remainder;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
                
        }
            if(sum==num){
                System.out.print("It is a special number");
            }else{
                System.out.print("It is a not special number");
            }
    }
}
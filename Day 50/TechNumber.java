import java.util.Scanner;
class TechNumber{
    public static void main(String [] args ){
        Scanner scan=new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        int a=0;
        int b=0;
        int count=0;
        int temp2=num;

        while (temp!=0){
            temp=temp/10;
            count++;
        }

        if(count%2 == 0){
            int countNum=count/2;

            while(countNum!=0){
                int remainder=temp2%10;
                b= b*10 + remainder;
                temp2 /= 10;
                countNum--;
            }

            a=temp2;
            int c=0;

            while(b!=0){
                int remainder=b%10;
                c=c*10+remainder;
                b=b/10;
            }
            int result = (a+c) * (a+c);
            if(num==result){
                System.out.print("It is Tech Number");
            }else{
                System.out.print("It is not Tech Number");
            }

        }else{
            System.out.print("It is not Tech Number");
        }
    }
}    
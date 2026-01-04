import java.util.Scanner;
class LCM{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=scan.nextInt();
        System.out.print("Enter second number: ");
        int num2=scan.nextInt();
        int minNum=Math.min(num1,num2);
        int hcf=1;
        int lcm=1;
        for(int i = 2;i<=minNum;i++){
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
                lcm=(num1*num2)/hcf;
            } 
        }System.out.print("LCM = "+lcm);
        
    }
}
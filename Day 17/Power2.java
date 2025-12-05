import java.util.Scanner;
class Power2{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base=scan.nextInt();
        System.out.print("Enter the power : ");
        int power=scan.nextInt();
        int result=1;
        if(power==0){
            System.out.print("Result is :"+result);
        }else{
            for (int i = 1; i<=power;i++){
                result=result*base;
            }   
            System.out.print("Result is :"+result);
        }

        }
        
    }

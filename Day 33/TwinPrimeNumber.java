import java.util.Scanner;
class TwinPrime{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1=scan.nextInt();
        System.out.print("Enter Second Number :");
        int num2=scan.nextInt();
        if (num1==0 || num2==0){
            System.out.print("Not a prime number");
        }else{
            boolean isPrime=true;
            for (int i=2; i<num1; i++){
                if(num1%i == 0){
                     isPrime=false;
                     break;
                }
            }

            if (isPrime){
                for (int i =2;i<num2;i++){
                    if(num2%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }

            if(isPrime){
                int temp=num2-num1;
                if (temp==2){
                    System.out.print("It is Twin Prime Number");
                }else{
                    System.out.print("It is not a Twin Prime Number");
                }
            }else{
                System.out.print("Not a prime number");
            }
        }
        
    }
}
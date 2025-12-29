import java.util.Scanner;
class TwistedPrime{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();

        if (num <=1 ){
            System.out.print("It is not a Twisted Prime Number");
        }else{
            boolean isPrime=true;
            for (int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                int temp = num;
                int reverseNum=0;
                while (temp !=0) {
                    int remainder = temp % 10 ;
                    reverseNum = reverseNum*10 + remainder;
                    temp = temp/10;
                }

                boolean isPrime2=true;
                for (int i=2;i<reverseNum;i++){
                    if(reverseNum%i==0){
                        isPrime2=false;
                        break;
                    }
                }

                if (isPrime2 && reverseNum != num){
                    System.out.print("It is a twisted Prime Number");
                }else{
                    System.out.print("It is not a Twisted Prime Number");
                }
            }else{
                System.out.print("It is not a Twisted Prime Number");
            }
        }

        

        
}
}
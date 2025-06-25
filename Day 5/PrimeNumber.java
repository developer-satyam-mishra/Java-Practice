import java.util.Scanner;
class PrimeNumber{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rem=0;
        if(number==1)
            System.out.println("Not a prime number");
        for(int i = 2; i < number ; i++){
            if(number % i== 0){
                rem=rem+1;
            }
        }
        if(rem==0){
            System.out.println(number+ " is a prime number");
        }
        else{
            System.out.println(number+ " is not a prime number");
        }
    }
}




class PrimeNumber2{
    public static void main(String args[]){
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        if (number==1){
            System.out.println("Not a prime number" );
        }else {
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }
    }
}        
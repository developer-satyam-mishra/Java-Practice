import java.util.Scanner;
class PrimeNumber{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rem=0;
        if(number==1)
            System.out.println("Not a prime number");
        for(int i = 2; i <number ; i++){
            if(number % i== 0)
            rem=rem+1;
        }
        if(rem==0){
            System.out.println(number+ " is a prime number");
        }
        else{
            System.out.println(number+ " is not a prime number");
        }
    }
}
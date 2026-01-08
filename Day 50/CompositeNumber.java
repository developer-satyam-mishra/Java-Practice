import java.util.Scanner;
class CompositeNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=scan.nextInt();
        if (num==0){
            System.out.print("Not a Composite Number");
        }
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.print("Not a Composite Number");
        }else{
            System.out.print("Composite Number");
        }
    }
}
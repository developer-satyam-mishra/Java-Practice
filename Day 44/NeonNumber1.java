import java.util.Scanner;
class NeonNumber1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num= scan.nextInt();
        int temp = num*num;
        int result=0;
         while (temp != 0){
            int rem = temp % 10 ;
            result = result + rem;
            temp = temp/10;
        }
        if (result==num){
                System.out.print("It is Neon Number");
            }else{
                System.out.print("It is not a Neon Number");
            }

    }
}
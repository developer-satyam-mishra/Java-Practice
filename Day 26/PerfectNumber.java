import java.util.Scanner;
class PerfectNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();
        int result=0;
        for (int i=1;i<=num/2;i++){
            if(num%i==0){
                result=result+i;
            }
        }
        if (result == num && num != 0) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

    }
}
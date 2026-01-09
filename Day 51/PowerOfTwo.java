import java.util.Scanner;
class PowerOfTwo{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int temp=num;
        while(temp%2==0){
            temp=temp/2;
        }
        if(temp==1){
            System.out.print("It is PowerOfTwo ");
        }else{
            System.out.print("It is not PowerOfTwo ");
        }
    }
}
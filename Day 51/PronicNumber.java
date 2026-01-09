import java.util.Scanner;
class PronicNumber{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        boolean isPronic=false;
        for (int i = 0;i<=num;i++){
            if(i*(i+1)==num){
                isPronic=true;
                break;
            }
        }
        if(isPronic){
            System.out.print("It is Pronic Number");
        }else{
            System.out.print("It is not Pronic Number");
        }
    }
}
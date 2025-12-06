import java.util.Scanner;
class Factor{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();
        System.out.print("Factor of the number are : ");
        for (int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}
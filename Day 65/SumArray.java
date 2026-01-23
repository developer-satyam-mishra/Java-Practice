import java.util.Scanner;
class SumArray{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num[]=new int[6];
        int sum=0;
        for (int i =0;i<num.length;i++){
            num[i]=scan.nextInt();
            sum=sum+num[i];
        }
         
        System.out.print("Sum of the array : " +sum);
    }
}
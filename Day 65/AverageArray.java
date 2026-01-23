import java.util.Scanner;
class AverageArray{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num[]=new int[6];
        int sum=0;
        for (int i =0;i<num.length;i++){
            num[i]=scan.nextInt();
            sum=sum+num[i];
        }
        int average=sum/num.length;
        System.out.print("Sum of the array : " +average);
    }
}
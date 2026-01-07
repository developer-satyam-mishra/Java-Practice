import java.util.Scanner;
class DisariumNumber{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int count=0;
        int temp=num;
        int sum=0;
        int temp2=num;
         while (temp!=0){
            temp=temp/10;
            count++;
        }while (temp2 != 0) {
            int remainder = temp2 % 10;
            sum =sum+ (int)Math.pow(remainder, count);
            temp2 = temp2/10;
            count--;
        }
        if(num==sum){
            System.out.print("It is Disarium number");
        }else{
            System.out.print("It is not Disarium number");
        }
    }
}   
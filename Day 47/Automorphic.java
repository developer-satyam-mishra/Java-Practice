import java.util.Scanner;
class Automorphic{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int count = 0 ;
        int tempNum1=num;
        int tempNum2=num;
        int reverseNum=0;
        int square=num*num;
        int reverseSquare=0;

        while (tempNum1!=0){
            tempNum1 /= 10;
            count++;
        }

        while(tempNum2!=0){
            int remainder=tempNum2%10;
            reverseNum=reverseNum*10+remainder;
            tempNum2=tempNum2/10;
        }

        for (int i =1;i<=count;i++){
            int remainder=square%10;
            reverseSquare=reverseSquare*10+remainder;
            square=square/10;
        }

        if(reverseNum==reverseSquare){
            System.out.print("It is a Automorphic Number");
        }
        else{
            System.out.print("It is not a Automorphic Number");
        }
    }
}
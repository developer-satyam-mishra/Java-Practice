import java.util.Scanner;
class LeapYear{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year=scan.nextInt();
        if( year%400==0){
            System.out.print("It is a leap year");
        }else if (year%100==0){
            System.out.print("It is not a leap year");
        }else if (year%4==0){
            System.out.print("It is a leap year");
        }else{
            System.out.print("It is not a leap year");
        }
    }
}
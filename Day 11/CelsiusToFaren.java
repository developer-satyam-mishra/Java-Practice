import java.util.Scanner;
class Celsius{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        float C=scan.nextFloat();
        float F=(C*9/5)+32;
        System.out.print("Celsius converted into Farenheit : "+F);
    }
}
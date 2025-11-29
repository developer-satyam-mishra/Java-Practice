import java.util.Scanner;
class Kilometer{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Kilometer : ");
        float KM=scan.nextFloat();
        float Miles=0.62f;
        float Convert=KM*Miles;
        System.out.print(" Km Converted into mile : "+Convert);
        
    }
}
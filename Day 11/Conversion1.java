import java.util.Scanner;
class Conversion1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the milliseconds : ");
        float ms=scan.nextFloat();
        float min=1/60000f;
        float c1=ms*min;
        System.out.println("Milliseconds converted into minutes : "+c1);
        float sec=1/1000f;
        float c2=ms*sec;
        System.out.println("Milliseconds converted into seconds : "+c2);
    } 
}
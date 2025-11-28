import java.util.Scanner;
class Distance{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter x1 point : ");
    double x1=scan.nextDouble();
    System.out.print("Enter x2 point : ");
    double x2=scan.nextDouble();
    System.out.print("Enter y1 point : ");
    double y1=scan.nextDouble();
    System.out.print("Enter y2 point : ");
    double y2=scan.nextDouble();
    double TP=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
    System.out.print("Distance between two points are : "+TP);
    }
}
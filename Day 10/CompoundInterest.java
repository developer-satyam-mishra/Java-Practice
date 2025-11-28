import java.util.Scanner;
class CompoundInterest{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        double P=scan.nextDouble();
        System.out.print("Enter the Rate of Interest(%) : ");
        double R=scan.nextDouble();
        System.out.print("Enter the Time(in years) : ");
        double T=scan.nextDouble();
        double A= P*Math.pow((1+R/100),T);
        System.out.println("Amount : "+A);
        double CI=A-P;
        System.out.print("Compund Interest : "+CI);
    }
}
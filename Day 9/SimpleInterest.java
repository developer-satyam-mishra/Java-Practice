import java.util.Scanner;
class SimpleInterest{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Principal(initital amount) :");
        float p=scan.nextFloat();
        System.out.print("Enter rate of interest(%) :");
        float r=scan.nextFloat();
        System.out.print("Enter Time(years) :");
        float t=scan.nextFloat();
        float SimpleInterest=(p*r*t)/100;
        System.out.print("Simple interest : "+SimpleInterest);
    }
}
import java.util.Scanner;
class Conversion2{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Grams : ");
        float gm=scan.nextFloat();
        float km=1/1000f;
        float c=km*gm;
        System.out.print(gm+" Grams converted into kilograms : "+c);
    }
}
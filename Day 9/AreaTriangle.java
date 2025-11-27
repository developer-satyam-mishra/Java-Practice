import java.util.Scanner;
class AreaTriangle{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter base(in cm)");
        float base=scan.nextFloat();
        System.out.println("Enter height(in cm)");
        float height=scan.nextFloat();
        float Area= 0.5f*base*height;
        System.out.println("Area of triangle is "+Area);
    }
}
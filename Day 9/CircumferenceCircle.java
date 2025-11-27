import java.util.Scanner;
class CircumferenceCircle{
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    float radius=scan.nextFloat();
    float pie=3.14f;
    float area= 2*radius*pie;
    System.out.println("Area of circle is "+area);



    }
}
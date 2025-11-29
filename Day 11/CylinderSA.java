import java.util.Scanner;
class SurfaceArea{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Radius of cylinder : ");
        float R=scan.nextFloat();
        System.out.print("Enter Height of cylinder : ");
        float H=scan.nextFloat();
        float pie=3.14F;
        float TSA= 2*pie*R*(R+H);
        System.out.print("Total surface area : "+TSA);

    }
}
import java.util.Scanner;
class Profit{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Selling Price of the products :");
        int Selling=scan.nextInt();
        System.out.print("Cost Price of the products :");
        int cost=scan.nextInt();
        int Profit=Selling-cost;
        System.out.print("Profit of the products is : "+Profit);
    }
}
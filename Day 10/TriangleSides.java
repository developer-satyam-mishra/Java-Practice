import java.util.Scanner;
class TriangleSideI{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Give 1st side : ");
        int a=scan.nextInt();
        System.out.print("Give 2st side : ");
        int b=scan.nextInt();
        System.out.print("Give 3st side : ");
        int c=scan.nextInt();
        if( (a!=b && b!=c) || (b!=c && b!=a )|| (c!=a && a!=b)){
            System.out.print("Triangle is scalene ");
        }else if((a==b && b==c) || (b==c && c==a) || (c==a && a==b)){
            System.out.print("Triangle is eqilateral ");
        }else if ((a!=b && b==c) || (b!=c && b==a )|| (c!=a && a==b)){
            System.out.print("Triangle is isosceles ");
        }
    }
}


class TriangleSideII{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Give 1st side : ");
        int a=scan.nextInt();
        System.out.print("Give 2st side : ");
        int b=scan.nextInt();
        System.out.print("Give 3st side : ");
        int c=scan.nextInt();
        if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2) || Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2)){
            System.out.print("Traingle is Right Angle Triangle ");
        }else{
            System.out.print("Triangle is not right angle triangle ");
        }
    }
}
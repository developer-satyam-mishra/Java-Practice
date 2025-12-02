import java.util.Scanner;
class ThreeNumbers{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter second number : ");
        int num2=scan.nextInt();
        System.out.print("Enter third number : ");
        int num3=scan.nextInt();
        if (num1>num2 && num1>num3){
            System.out.print("Fisrt number is largest");
        }else if (num2>num1 && num2>num3){
            System.out.print("Second number is largest");
        }else if (num1==num2 && num2==num3 && num3==num1){
            System.out.print("Number are equals");
        }else if (num3>num1 && num3>num2){
            System.out.print("Third number is largest");
        }
    }
}


class ThreeNumbers1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter second number : ");
        int num2=scan.nextInt();
        System.out.print("Enter third number : ");
        int num3=scan.nextInt();
        if (num1<num2 && num1<num3){
            System.out.print("Fisrt number is smallest");
        }else if (num2<num1 && num2<num3){
            System.out.print("Second number is smallest");
        }else if (num1==num2 && num2==num3 && num3==num1){
            System.out.print("Number are equals");
        }else if (num3<num1 && num3<num2){
            System.out.print("Third number is smallest");
        }
    }
}


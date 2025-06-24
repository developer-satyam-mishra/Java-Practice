import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int no1=s.nextInt();
        System.out.println("Enter Your Second Number");
        int no2=s.nextInt();
        System.out.println("Select Your symbol(+,-,*,/)");
        String symbol=s.next();
        int res;
        switch(symbol){
            case "+": res=no1+no2;
            System.out.println("Addition is :"+res);
            break;
            case "-": res=no1-no2;
            System.out.println("Subtraction is :"+res);
            break;
            case "*": res=no1*no2;
            System.out.println("Multiplication is :"+res);
            break;
            case "/": res=no1/no2;
            System.out.println("Division is :"+res);
            break;
            default:System.out.println("invalid");
        }

    }
}
import java.util.Scanner;
class Factorial{
    long factorial_of_a_number=1;

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Write the number : " );
        int number=scan.nextInt();
        Factorial obj=new Factorial();
        obj.calFact(number);
        System.out.print("Factorial of "+number +" : " + obj.factorial_of_a_number);
    }
    
    long calFact(int number){
        if(number > 1){
            factorial_of_a_number = factorial_of_a_number * number;
            calFact(number - 1);
        }
        return factorial_of_a_number;
    }


}
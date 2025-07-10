import java.lang.Math;
class ArmstrongNumber{
    public static void main(String args[]){
        int number = 153;
        int temp = number;
        int digit = 0;
        double armstrong = 0;
        while(temp>0){
            digit = digit + 1;
            temp = temp/10;
        }
        temp = number;
        while(temp>0){
        int remainder = temp % 10;
        armstrong = armstrong + Math.pow ( remainder,digit);
        temp = temp/10;
        }
        if (number == armstrong){
            System.out.println("IT IS ARMSTRONG NUMBER");
        }
        else{
            System.out.println("it is not palindrome number");
        }

    }

}
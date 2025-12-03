import java.util.Scanner;
class Alphabet{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the alphabet : ");
        char alpha=scan.next().charAt(0);
        if (alpha>='A' && alpha<='Z' || alpha>='a' && alpha<='z'){
            System.out.print("It is a Alphabet");
        }else{
            System.out.print("Not a alphabet");
        }
    }
}
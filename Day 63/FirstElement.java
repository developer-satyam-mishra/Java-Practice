import java.util.Scanner;
class FirstElement{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num[]=new int[6];
        for (int i =0;i<num.length;i++){
            num[i]=scan.nextInt();
        }
        System.out.print("Last element of the array : " +num[0]);
    }
}
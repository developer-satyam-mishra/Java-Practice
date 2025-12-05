import java.util.Scanner;
class Sum{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the n number : ");
        int num=scan.nextInt();
        int evenresult=0;
        int oddresult=0;
        for (int i=1;i<=num;i++){
            if(i%2==0){
                evenresult+=i;
            }else{
                oddresult+=i;
            }
        }System.out.println("Sum of even n numbers : "+evenresult);
         System.out.println("Sum of odd n numbers : "+oddresult);          
        
    }        
}
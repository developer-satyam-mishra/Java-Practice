import java.util.Scanner;
class SortedArrayDeletionBetweenIndex{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number before deletion :");
        int num[]=new int[5];
        for (int i = 0; i<num.length;i++){
            num[i]=scan.nextInt();
        }
        System.out.print("Enter the index number :");
        int index=scan.nextInt();
        
         for (int i =index;i<num.length-1;i++){
            num[i]=num[i+1];
         }
         System.out.print("Number after deletion :");
         for (int i= 0;i<num.length-1;i++){
            System.out.print(num[i]+",");
         }
    }
}
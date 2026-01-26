import java.util.Scanner;
class SortedArrayDeletionAtFirstIndex{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number before deletion :");
        int num[]=new int[5];
        for (int i = 0; i<num.length;i++){
            num[i]=scan.nextInt();
        }
         for (int i =0;i<num.length-1;i++){
            num[i]=num[i+1];
         }
         System.out.print("Number after deletion :");
         for (int i= 0;i<num.length-1;i++){
            System.out.print(num[i]+",");
         }
    }
}
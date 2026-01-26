import java.util.Scanner;
class SortedArrayInsertionLastIndex{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number before insertion :");
        int num[]=new int[5];
        for (int i = 0; i<num.length-1;i++){
            num[i]=scan.nextInt();
        }
         System.out.print("Number after insertion :");
         num[num.length-1]=18;
         for (int i = 0; i<num.length;i++){
            System.out.print(num[i]+",");
         }
    }
}
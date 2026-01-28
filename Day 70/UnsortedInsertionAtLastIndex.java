import java.util.Scanner;
class UnsortedInsertionAtLastIndex{
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        System.out.print("Array before insertion : ");
        int num[]=new int[7];
        for(int i = 0;i<num.length-1;i++){
            num[i]=scan.nextInt();
        }
        
        System.out.print("Enter the number to insert : ");
        int num1=scan.nextInt();
        
        num[num.length-1]=num1;
        
        System.out.print("Array after insertion : ");
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+",");
        }

    }
}
import java.util.Scanner;
class SortedArrayInsertionAtIndex{
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Array before insertion: ");
        int num[]= new int[5];
        for (int i= 0; i<num.length-1;i++){
            num[i]=scan.nextInt();
        }
        
        for (int i= num.length -1 ;i>0;i--){
            num[i]=num[i-1];
        }

        num[0]=18;
        System.out.print("Array after insertion: ");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+ ",");
        }
    }
}
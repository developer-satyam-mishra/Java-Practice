import java.util.Scanner;
class AccessElement{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int arr[] = new int[5];
        for( int i =0;i<arr.length;i++ ){
            arr[i]=scan.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int num=arr[3];
        System.out.print("Value at index number 3 : "+num);
    }
}
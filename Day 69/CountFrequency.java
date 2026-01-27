import java.util.Scanner;
class CountFrequency{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Array = ");
        int arr[]=new int[8];
        for (int i = 0; i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
         int count=0;
        System.out.print(" Enter the Number : ");
        int num=scan.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        } 
        System.out.print(+count);

        
    }
}
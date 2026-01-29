import java.util.Scanner;
class RemoveSpecificItem{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array : ");
        int arr[]=new int[5];
        int newArr[]=new int[arr.length];

        for (int i=0;i<arr.length;i++){
             arr[i]=scan.nextInt();
        }

        int index=0;
        System.out.print("Enter the number to remove : ");
        int num=scan.nextInt();

        for (int i = 0; i<arr.length;i++){
            if(arr[i]!=num){
                newArr[index]=arr[i];
                index++;
            }
            
        }

        for(int i =0;i<index;i++){
          System.out.print(newArr[i]+ ",");
        }
        
    }
}
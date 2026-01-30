import java.util.Scanner;
class LargestSmallestNumber{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array : ");
        int arr[]=new int[5];

        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        int largestNumber=Integer.MIN_VALUE;
        int smallestNumber=Integer.MAX_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>=largestNumber){
                largestNumber=arr[i];
            }
            if(arr[i]<=smallestNumber){
                smallestNumber=arr[i];
            }
        }

        System.out.println("Largest number is "+largestNumber);
        System.out.print("Smallest number is "+smallestNumber);
        
    }
}
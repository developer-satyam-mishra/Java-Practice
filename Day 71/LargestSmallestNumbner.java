import java.util.Scanner;
class LargestSmallestNumbner{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array : ");
        int arr[]=new int[5];
        

        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        
        int largest=arr[0];
        int smallest=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>=largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest number in array : "+largest);

         for (int i=1;i<arr.length;i++){
            if(arr[i]<=smallest){
                smallest=arr[i];
            }
        } 
        System.out.print("Smallest number in array : "+smallest);
    }
}

import java.util.Scanner;
class SecondLargestNumber{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array : ");
        int arr[]=new int[5];

        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i=1;i<arr.length;i++){
            if(arr[i]>=largest){
                secondLargest=largest;
                largest=arr[i];
                
            }else if(arr[i]>=secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest number is  "+largest);
        System.out.print("Second largest number is "+secondLargest);
    }
}
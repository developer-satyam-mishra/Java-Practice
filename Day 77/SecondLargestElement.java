import java.util.Scanner;
class SecondLargestElement{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        int largestNum=Integer.MIN_VALUE;
        int secondNum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>largestNum){
            secondNum=largestNum;
            largestNum=nums[i];
        }
        else if(nums[i]>=secondNum && nums[i]<largestNum){
            secondNum=nums[i];
        }
        }
        System.out.println("Largest element " +largestNum);
        System.out.print("Second Largest element " +secondNum);

    }
}
import java.util.Scanner;
class LargestElement{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        }
        System.out.print("Largest element " +max);
    }
}
import java.util.Scanner;
import java.util.Arrays;
class MaximumProduct{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        Arrays.sort(nums);
        int max;
        int num1= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int num2= nums[0]*nums[1]*nums[nums.length-1];
        max=Math.max(num1,num2);
        System.out.print("Maximum Product of three numbers are : "+max);
    }
}
import java.util.Scanner;
class MoveZero {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        int index=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==0 && nums[i+1]!=0){
                nums[index]=nums[i+1];
                nums[i+1]=0;
                index++;
            }
            else if(nums[i]!=0){
                nums[index]=nums[i];
                index++;

            }
        }
        System.out.print(" New array is : ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
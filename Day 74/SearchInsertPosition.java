import java.util.Scanner;
class SearchInsertPosition {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        int rem=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        System.out.print("Enter the target number : ");
        int target=scan.nextInt();
        for(int i=0;i<nums.length;i++){
         if(nums[i]>=target){
            rem=i;
            System.out.print("Position of the target number is : "+rem);
            break; 
         }
        }
        
    }
} 
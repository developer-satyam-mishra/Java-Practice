import java.util.Scanner;
class BinarySearch {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        System.out.print("Enter the number : ");
        int target=scan.nextInt();
        int i=0;
        int j=nums.length-1;
        boolean isFound=false;
        while(j>=i){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                isFound=true;
                System.out.print("Number found at " +mid+" index ");
                break;
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        System.out.print("No number found ");      
    }
}
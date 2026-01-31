import java.util.Scanner;
class SingleNumber {
    public static void main(String [] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Array is: ");
        int nums[]=new int[6];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        for(int i =0;i<nums.length;i++){
            int count=1;
            boolean isFound=false;
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    isFound=true;
                    count++;
                }
            }
            if(!isFound){
                for(int k=i+1;k<nums.length;k++){
                    if(nums[i]==nums[k]){
                        count++;
                    }
                }
                
            }
            if(count==1){
             ans= nums[i];
             break;
            }
        }
        System.out.print("Single number is "+ans);
    }
}
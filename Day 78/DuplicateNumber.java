import java.util.Scanner;
import java.util.HashMap;
class DuplicateNumber {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.print("  Duplicate number present in the array is : ");
        for(int num:nums){
            if(map.get(num)>1){
                System.out.print(num);
                break;
            }
        }
        
    }
}
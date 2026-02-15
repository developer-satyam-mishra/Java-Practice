import java.util.Scanner;
import java.util.HashSet;
class BinarySearch2 {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        boolean isFound=false;
        for(int num:nums){
           if(set.contains(num)){
            isFound =true;
            break;
        }
        else{
            set.add(num);
        }
       }
       if(isFound){
        System.out.print("It contains duplicate number");
       }else{
        System.out.print("It does not contain duplicate number");
       }
    }
}
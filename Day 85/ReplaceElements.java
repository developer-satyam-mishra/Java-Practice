import java.util.Scanner;
class ReplaceElements {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (temp < nums[j]) {
                    temp = nums[j];  
                }
            }
            nums[i] = temp;
        }

        nums[nums.length - 1] = -1;

        System.out.print("After replacing the array : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
    }
}
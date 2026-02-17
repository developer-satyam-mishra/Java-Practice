import java.util.Scanner;
class ShuffleArray {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }

         int newNum[] = new int[nums.length];
        int index1 = 0;
        int index2 = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                newNum[i] = nums[index1++];
            } else {
                newNum[i] = nums[index2++];
            }
        }

        System.out.print("New Array is: ");
        for (int i = 0; i < newNum.length; i++) {
            System.out.print(newNum[i] + " ");
        }
            
    }
}
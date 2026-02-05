import java.util.Scanner;
class EvenNumberDigits {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int nums[]=new int[6];
        for(int i=0;i<nums.length;i++){
            nums[i]=scan.nextInt();
        }
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int count=0;
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            if(count%2==0){
                evenCount++;
            }
        }
        System.out.print("Total number of even digits present in the array is : "+evenCount);
    }
}
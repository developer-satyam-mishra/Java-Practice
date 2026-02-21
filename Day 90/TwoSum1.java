import java.util.Scanner;
class TwoSum1 {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.print("Target : ");
        int target=scan.nextInt();
        int i=0;
        int j=numbers.length-1;
        boolean found = false;
        while(j>i){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                System.out.println("Pair Found at index number " + i + " and " + j);
                found = true;
                break;

            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
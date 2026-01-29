import java.util.Scanner;
class CountPositiveNegativeNumber{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the array : ");
        int arr[]=new int[5];
        int countPositive=0;
        int countNegative=0;

        for (int i=0;i<arr.length;i++){
             arr[i]=scan.nextInt();
        }

        for (int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                countPositive++;
            }
            else{
                countNegative++;
            }
        }
        System.out.println("Total positive numbers in array are "+countPositive);
        System.out.print("Total negative numbers in array are "+countNegative);
    }
}
import java.util.Scanner;
class SpecifiedValue{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scan.nextInt();
        int arr[]={78,18,65,58,96};
        boolean isFound=false;
        for (int i = 0;i < arr.length;i++){
            if (num==arr[i]){
                isFound = true;
                System.out.print("Number found at " +i);
                break;
            }
        }
        if(!isFound){
            System.out.print("Number not found");
        }

    }
}
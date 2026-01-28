import java.util.Scanner;
class CountFrequency{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Array = ");
        int num[]=new int[6];
        for(int i = 0;i<num.length;i++){
             num[i]=scan.nextInt();
        }
        for (int i = 0; i<num.length;i++){
            boolean isFound=false;
            for(int k=0;k<i;k++){
                if(num[i]==num[k]){
                    isFound=true;
                    break;
                }
            }
            if(isFound==false){
                int count=0;
                for (int j = 0 ;j<num.length;j++){
                    if(num[i]==num[j]){
                        count++;
                    }
                }
                System.out.println("Frequency of "+num[i]+" is " +count);
            }
        }
        
    }
}
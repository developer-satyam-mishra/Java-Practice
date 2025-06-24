import java.util.Scanner;

class Table{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=scan.nextInt();
        for(int i=1;i<=10;i++){
            int table=i*number;
            System.out.println(table);

        }

        


    }
}

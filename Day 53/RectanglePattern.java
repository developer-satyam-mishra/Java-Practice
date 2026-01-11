import java.util.Scanner;
    class RectanglePattern{
        public static void main(String[]args){
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the row:");
            int row=scan.nextInt();
            System.out.print("Enter the column:");
            int column=scan.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=column;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
  }

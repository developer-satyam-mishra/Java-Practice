class MultiplicationTable{
    public static void main(String[]args){
        int number = 19;
        int temp=1;
         System.out.print("Table of "+number+" is ");
        for ( int i = 1 ; i <=10;i++){
             temp = number * i;
             System.out.print(temp+", ");
        }
        
    }
}
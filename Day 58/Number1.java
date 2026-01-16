class Number1{
    public static void main(String[]args){
        int num = 6;
        for (int i = 1;i<=num;i++){
            for (int j = 1;j<=num;j++){
                if( j==(num/2) || i==num || i==2 && j<=(num/2) )  {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
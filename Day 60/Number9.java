class Number9{
    public static void main(String[]args){
        int num = 6;
        for (int i = 1;i<=num;i++){
            for (int j = 1;j<=num;j++){
                if( i==(num/2) || j==num || j==1 && i<=(num/2) || i==1)  {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
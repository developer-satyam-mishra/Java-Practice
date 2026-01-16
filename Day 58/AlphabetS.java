class AlphabetS{
    public static void main (String[]args){
        int num = 6;
        for (int i = 1;i<=num;i++){
            for (int j = 1;j<=num;j++){
                if(i==1 || i==(num/2) || i==num || j==1 && i<=(num/2) || j==6 && i>=(num/2))  {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
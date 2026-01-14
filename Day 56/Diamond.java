class Diamond{
    public static void main(String[]args){
       int num = 4;
        for (int i = num;i>=1;i--){
            for (int j = 1;j<=num;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         for(int i = num;i>=1;i--){
            for(int j= num;j>=1;j--){
                if(i>=j && i!=j){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
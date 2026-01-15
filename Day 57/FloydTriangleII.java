class FloydTriangleII{
    public static void main (String[]args){
        int num = 6;
        int result =1;
        for (int i = 1;i<=num;i++){
            for (int j = 1;j<=num;j++){
                if(i>=j){
                    System.out.print(" "+result+" ");
                    result++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class FloydTriangleIV{
    public static void main (String[]args){
        int num = 6;
        int result=0;
        for (int i = 1;i<=num;i++){
            result++;
            for (int j = 1;j<=num;j++){
                if(i>=j){
                    System.out.print(" "+result+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
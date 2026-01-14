class HalfDiamond{
    public static void main (String[]args){
        int num=9;
        for(int i = 1;i<=num;i++){
            for(int j= num;j>=1;j--){
                if(i>=j){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
        for(int i = num;i>=1;i--){
            for(int j= num;j>=1;j--){
                if(i>=j && i!=j){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
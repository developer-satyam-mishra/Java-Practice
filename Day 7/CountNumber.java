class CountNumber{
    public static void main(String[]args){
        int number = 5864;
        int count = 0 ;
        while (number!=0){
            number /= 10;
            count++;
        }
        System.out.println("Total numbers of digits are " +count);
    }
}
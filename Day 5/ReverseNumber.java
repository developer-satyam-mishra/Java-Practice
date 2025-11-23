class ReverseNumber{
    public static void main(String[] args){
        int number = 1234;
        int temp = number;
        int result = 0;
        while (temp !=0) {
            int remainder = temp % 10 ;
            result = result*10 + remainder;
            temp = temp/10;
        }
        System.out.println("Reverse of a number is " +result);
    }

}
class SumDigits{
    public static void main(String[]args){
        int number = 181818;
        int temp = number;
        int sum = 0 ;
        while(number != 0){
            int rem = number % 10;
            sum = sum + rem ;
            number = number/10;
        }
        System.out.println("Sum of "+temp+" is " +sum);
    }
}
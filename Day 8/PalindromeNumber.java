class PalindromeNumber{
    public static void main(String args []){
        int number=121;
        int reverseNumber = 0;
        int temp=number;
        while(temp>0){
            int remainder = temp % 10;
            reverseNumber = reverseNumber*10 + remainder;
            temp = temp/10;
        }
        if(reverseNumber == number){
            System.out.println("it is palindrome number");
        }
        else{
            System.out.println("it is not palindrome number");
        }

    }
}
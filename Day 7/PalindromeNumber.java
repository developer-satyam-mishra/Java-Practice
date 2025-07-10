class PalindromeNumber
{
   public static void main(String args[]){
     int number = 1818;
     int digit = number;
     int reverse = 0, remainder;
        while (digit !=0)
    {
        remainder = digit % 10;
        reverse = reverse % 10+remainder;
        digit = digit/10;
    }
    if (number == reverse )
    {
        System.out.println(number + " is a palindrome number");
    }
    else 
    {
        System.out.println(number + " is not a palindrome number");
    }

   }
}
class PrimeNumber 
{
    public static void main(String args[])
    {
        boolean isPrime=true;
        for(int number=2; number< 100; number++){
                for(int i=2;i<=number-1;i++){
                if(number % i == 0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.print(number+", ");
            }
            else{
                isPrime=true;
            }
        }
    }
}
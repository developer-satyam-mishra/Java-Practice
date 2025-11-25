class SumEven
    {
    public static void main(String[]args)
       {
        int number = 18181;
        int temp = number;
        int sumeven = 0;
        int sumodd = 0;
        while (number != 0){
            int rem = number % 10;
            if (number % 2 == 0){
                sumeven = sumeven + rem;
                }
                else{
                    sumodd = sumodd + rem;
                }
                number = number/10;
            }
            System.out.println("Sum of even and odd digits numbers are " +sumeven+ " and " +sumodd);
        }
    }

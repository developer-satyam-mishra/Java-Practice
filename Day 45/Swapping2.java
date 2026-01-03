class Swapping2{
    public static void main(String[] args)
    {
     int a = 50;
     int b = 30;
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println("After swapping two numbers a and b are " +a+ " and " +b);
    }
}
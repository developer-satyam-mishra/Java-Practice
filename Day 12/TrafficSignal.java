import java.util.Scanner;
class TrafficSignal
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Traffic Signal : ");
        String sig=scan.nextLine();
        if(sig.equals("Red")){
            System.out.print("Stop ");
        }else if (sig.equals("Yellow")){
            System.out.print("Ready ");
        }else if(sig.equals("Green")){
            System.out.print("Go ");
        }else{
            System.out.print("Invalid");
        }
    }
    
}
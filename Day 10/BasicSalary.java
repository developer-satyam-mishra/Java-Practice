import java.util.Scanner;
class BasicSalary{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter tha CTC : ");
        int CTC=scan.nextInt();
        System.out.print("Enter tha Travelling Allowance : ");
        int TA=scan.nextInt();
        System.out.print("Enter tha Dearness Allowance : ");
        int DA=scan.nextInt();
        System.out.print("Enter tha House Rent Allowance : ");
        int HRA=scan.nextInt();
        System.out.print("Enter tha Tax : ");
        int Tax=scan.nextInt();
        System.out.print("Enter tha Provident Fund : ");
        int PF=scan.nextInt();
        int Basic=CTC-TA-DA-HRA+Tax+PF;
        System.out.print("Basic Salary of the Employee is : " +Basic);
    }
}
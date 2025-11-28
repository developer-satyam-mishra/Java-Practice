import java.util.Scanner;
class CTC{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter tha Basic Salary : ");
        int Basic=scan.nextInt();
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
        int CTC=Basic+TA+DA+HRA-Tax-PF;
        System.out.print("CTC of the Employee is : " +CTC);
    }
}
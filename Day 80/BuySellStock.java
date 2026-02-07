import java.util.Scanner;
class BuySellStock {
    public static void main(String[]args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Array : ");
        int prices[]=new int[6];
        for(int i=0;i<prices.length;i++){
            prices[i]=scan.nextInt();
        }
        int minPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int num:prices){
            if(num<minPrices){
                minPrices=num;
            }
            else{
                maxProfit=Math.max(maxProfit,num-minPrices);
            }
        }
        System.out.print("Best time to buy the stock is Rs. "+minPrices+" and to sell is Rs. "+maxProfit);
    }
}
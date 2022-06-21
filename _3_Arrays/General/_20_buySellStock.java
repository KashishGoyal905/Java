package _3_Arrays.General;

public class _20_buySellStock {

    public static void main(String[] args) {
        int prices[] = { 2, 4, 1 };
        // int profit = 0;
        // for (int i = 0; i < prices.length; i++) {
        // for (int j = i + 1; j < prices.length - 1; j++) {
        // int largest = prices[i];
        // if (prices[j] - largest > profit) {
        // profit = prices[j] - largest;
        // }
        // }
        // }
        // System.out.println("Total profit: " + profit);

                            //------ optimized one:

        // if there is only day to buy
        if (prices.length == 1){
            System.out.println("0");
        }
        // maximun profit so far
        int maxProfit = 0;
        // least so far
        int lsf = Integer.MAX_VALUE;
        // current profit
        int currprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            // if current value is smaller than ksf then we update lsf
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            // calculating curr profit
            currprofit = prices[i] - lsf;
            // if currprofit is greater than our maxprofit so far then we update
            if (currprofit > maxProfit) {
                maxProfit = currprofit;
            }
        }
        System.out.println(maxProfit);
    }
}

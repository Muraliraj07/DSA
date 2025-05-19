package zoho;

public class E05_StockBuySell {

	public static void main(String args[]) {
		int prices[] = {7, 5, 3, 6, 1, 5};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			}
			else {
				int profit = price - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
}

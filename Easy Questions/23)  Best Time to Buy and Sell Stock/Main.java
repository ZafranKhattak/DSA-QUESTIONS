class Solution 
{
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int smallestValue = prices[0];

        for (int i=1; i<prices.length; i++)
        {
            if (prices[i] < smallestValue)
            {
                smallestValue = prices[i];
            }

            int profit = prices[i] - smallestValue;

            if (profit > maxProfit)
            {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

class Main 
{
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        int prices[] = {7,1,5,3,6,4};

        System.out.print(sol.maxProfit(prices));
    }
}
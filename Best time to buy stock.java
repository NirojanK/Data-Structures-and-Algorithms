//Problem : Best Time to buy stock
//Approach : Greedy
//Time : O(n)
//Space : O(1)
//Explanation : We keep track of the minimum price seen so far and calculate the profit at each step. We update the maximum profit accordingly.

//creat min price and profit variable
int minPrice = Intger.MAX_VALUE;
int maxProfit = 0;

for(int i =0; i < prices.length;i++){
    if(prices[i] < minPrices){
        minPrice = prices[i];// if we find a lower price then update min price to that price
    }else{
        int profit = prices[i] - minPrice;
        maxProfit = Math.max(maxProfit, profit);//
    }
}
return maxProfit;
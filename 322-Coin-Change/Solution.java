public class Solution {
    public int coinChange(int[] coins, int amount) {
	    if(amount<1) return 0;
	    int[] count = new int[amount+1];
	    int sum = 0;

	    while(++sum<=amount) {
	        int min = -1;
	        for(int coin : coins) {
	            if(sum >= coin && count[sum-coin]!=-1) {
	                int temp = count[sum-coin]+1;
	                min = min<0 ? temp : (temp < min ? temp : min);//第一次赋值，之后更新最小
	            }
	        }
	        count[sum] = min;
	    }
	    return count[amount];
	}
}
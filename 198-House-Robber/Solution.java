public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int curNotTaken = 0;
        int curTaken = 0;
        int robNot = 0;
        int rob = 0;
        for(int i = 0; i < len; i++){
            curNotTaken = Math.max(robNot,rob);
            curTaken = robNot + nums[i];
    
            robNot = curNotTaken;
            rob = curTaken;
        }
        return Math.max(curNotTaken,curTaken);
    }
}
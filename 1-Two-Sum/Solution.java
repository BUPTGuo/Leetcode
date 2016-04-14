public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            int key = target - nums[i];
            if(res.containsKey(key)){
                return new int[] {res.get(key), i};
            }
            else{
                res.put(nums[i],i);
            }
        }
        return null;
    }
}
public class Solution {
    //You may assume no duplicate exists in the array.
    public int findMin(int[] num) {
        int low = 0, high = num.length - 1;
        while (low < high && num[low] >= num[high]) {
            int mid = (low + high) / 2;
            if (num[mid] > num[high])
                low = mid + 1;
            else
                high = mid;
        }
        return num[low];
    }
}
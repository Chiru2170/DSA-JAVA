class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int maxlen = 0;
        int zeros = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }
            if (zeros <= k) {
                maxlen = Math.max(maxlen, j - i + 1);
            }
            j++;
        }
        return maxlen;
    }
}
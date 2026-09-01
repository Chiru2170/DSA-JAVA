class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Sliding Window
        int l = 0;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int r=0;r<nums.length;r++){
            sum += nums[r];
            if(r-l+1 == k){
                ans = Math.max(ans,sum);
                sum -= nums[l];
                l++;
            }
        }
        return (double)ans/k;
    }
}
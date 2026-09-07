class Solution {
    public long[] findPrefixScore(int[] nums) {
        // long[] conver = new long[nums.length];
        long[] arr = new long[nums.length];
        int max =  nums[0];
        // conver[0] = nums[0]+nums[0];
        arr[0] = nums[0]+nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            // conver[i] = nums[i] + max;
            arr[i] = arr[i-1] + nums[i] + max;
        }
        return arr;
    }
}
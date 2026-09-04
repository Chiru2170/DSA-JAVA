class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int r=0;r<nums.length-2;r++){
            if(nums[r]==0){
                nums[r] = 1;
                nums[r+1] = nums[r+1]^1;
                nums[r+2] = nums[r+2]^1;
                ans++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return -1;
        }
        return ans;
    }
}
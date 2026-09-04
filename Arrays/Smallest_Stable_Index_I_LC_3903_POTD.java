class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                if(nums[j]>max) max = nums[j];
            }
            for(int a=i;a<nums.length;a++){
                if(nums[a]<min) min = nums[a];
            }
            if((max-min)<=k) {
                return i;
            }
        }
        return -1;
    }
}
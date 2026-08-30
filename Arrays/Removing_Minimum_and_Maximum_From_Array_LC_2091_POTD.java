class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int max = nums[0];
        int min = nums[0];
        int minidx = 0;
        int maxidx = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxidx = i;
            }
            else if(nums[i]<min){
                min = nums[i];
                minidx = i;
            }
        }
        int leftTotal = Math.max(maxidx,minidx) + 1;
        int rightTotal = nums.length - (Math.min(maxidx,minidx));
        int total = (nums.length - (Math.max(minidx,maxidx))) + Math.min(maxidx,minidx) + 1;

        return Math.min(total,(Math.min(leftTotal,rightTotal)));
    }
}
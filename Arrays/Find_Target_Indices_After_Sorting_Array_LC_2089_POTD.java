class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int idx = 0;
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;

        // Binary Search -->

        // int lo = 0;
        // int hi = nums.length-1;
        // while(lo<=hi){
        //     int mid = lo + (hi-lo)/2;
        //     if(nums[mid]==target){
        //         ans.add(mid);

        //         int i = mid-1;
        //         while(i>=0 && nums[i]==target){
        //             ans.add(i);
        //             i--;
        //         }
        //         int j = mid+1;
        //         while(j<nums.length && nums[j]==target){
        //             ans.add(j);
        //             j++;
        //         }
        //         break;
        //     }
        //     else if(nums[mid]>target) hi = mid-1;
        //     else lo = mid + 1;
        // }
        // Collections.sort(ans);
        // return ans;
    }
}
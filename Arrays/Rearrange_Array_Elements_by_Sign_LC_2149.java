class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] ans = new int[nums.length];
        // int[] pos = new int[nums.length / 2];
        // int[] neg = new int[nums.length / 2];

        // int p = 0;
        // int q = 0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos[p] = nums[i];
        //         p++;
        //     }
        //     else{
        //         neg[q] = nums[i];
        //         q++;
        //     }
        // }
        // int a = 0;
        // int b = 0;
        // for(int i=0;i<ans.length;i++){
        //     if(i%2==0){ ans[i] = pos[a];
        //         a++;
        //     }
        //     else{
        //         ans[i] = neg[b];
        //         b++;
        //     }
        // }
        // return ans;

        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[neg] = nums[i];
                neg+=2;
            }
            else{
                ans[pos] = nums[i];
                pos+=2;
            }
        }
        return ans;
    }
}
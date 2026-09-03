class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2 = new int[nums1.length];
        int odd=Integer.MAX_VALUE;
        int j = Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                odd = Math.min(odd,nums1[i]);
                j=i;
            }
        }
        if(j==Integer.MIN_VALUE) return true;
        for(int i=0;i<nums2.length;i++){
            if(nums1[i]%2!=0){
                nums2[i] = nums1[i];
            }
            else if((nums1[i] - odd >= 1)&&j!=i){
                nums2[i] = nums1[i] - odd;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2==0) return false;
        }
        return true;
    }
}
class Solution {
    public int[] resultArray(int[] nums) {
        if(nums.length==1) return new int[]{nums[0]};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        for(int k=0;k<arr1.size();k++){
            ans[k] = arr1.get(k);
        }
        for(int k=0;k<arr2.size();k++){
            ans[k+arr1.size()] = arr2.get(k);
        }
        return ans;
    }
}
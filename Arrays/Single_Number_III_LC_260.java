class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : nums){
            if(map.get(ele) == 1) {
                ans[j] = ele;
                j++;
            }
        }
        return ans;
    }
}
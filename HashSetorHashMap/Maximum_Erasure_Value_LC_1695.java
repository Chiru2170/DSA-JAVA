class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int maxSum = 0;
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.get(nums[r]) > 1) {
                sum -= nums[l];
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
class Solution {
    public int sumOfUnique(int[] nums) {
        // int[] freq = new int[101];
        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        // int sum = 0;
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]==1) sum += i;
        // }
        // return sum;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        int sum = 0;
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            if(freq==1) sum += ele;
        }
        return sum;
    }
}
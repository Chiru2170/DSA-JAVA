// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         HashMap<Integer,Integer> map1 = new HashMap<>();
//         HashMap<Integer,Integer> map2 = new HashMap<>();

//         for(int ele : nums1){
//             if(map1.containsKey(ele)){
//                 int freq = map1.get(ele);
//                 map1.put(ele,freq+1);
//             }
//             else map1.put(ele,1);
//         }
//         for(int ele : nums2){
//             if(map2.containsKey(ele)){
//                 int freq = map2.get(ele);
//                 map2.put(ele,freq+1);
//             }
//             else map2.put(ele,1);
//         }
//         for(int ele : map1.keySet()){
//             if(map2.containsKey(ele) && (!arr.contains(ele))) arr.add(ele);
//         }
//         int[] ans = new int[arr.size()];
//         for(int i=0;i<ans.length;i++){
//             ans[i] = arr.get(i);
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele : nums1){
            map.add(ele);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.contains(nums2[i])){
                arr.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
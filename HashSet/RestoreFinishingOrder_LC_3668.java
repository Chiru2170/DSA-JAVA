class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<friends.length;i++){
            arr.add(friends[i]);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(arr.contains(order[i])){
                friends[j] = order[i];
                j++;
            }
        }
        return friends;
    }
}
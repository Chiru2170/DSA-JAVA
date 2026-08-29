class Solution {
    public int countOdds(int low, int high) {
        // long odd = 0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0) odd++;
        // }
        // return (int)odd;

        int range = (high-low) + 1;
        if(range%2==0) return range/2;
        else if(range%2!=0 && (low%2==0 || high%2==0)) return range/2;
        else{
            return range/2 + 1;
        }
    }
}
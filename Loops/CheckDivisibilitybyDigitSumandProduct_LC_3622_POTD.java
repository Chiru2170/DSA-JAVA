class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0;
        int prod = 1;
        int ans = 0;
        while (x > 0) {
            int rem = x % 10;
            sum += rem;
            prod *= rem;
            x /= 10;
        }
        ans = sum + prod;

        return n % ans == 0;
    }
}
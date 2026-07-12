class Solution {
    int[] dp;
    public int climb(int i){
        if(i == 1 || i == 2) return i;
        if(dp[i] != -1) return dp[i];
        // int ans = climb(i-1) + climb(i-2);
        // dp[i] = ans;
        // return ans;      these 3 line same to dp[i] = climb(i-1) + climb(i-2);

        return dp[i] = climb(i-1) + climb(i-2);
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);

        return climb(n);
    }
}
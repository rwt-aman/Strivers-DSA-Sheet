class Solution { // Tabulation
    public int climb(int n,int[] dp){
        if(n <= 2) return n;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2]; 
        }
        return dp[n];
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        return climb(n,dp);
    }
}


// class Solution {  // Memoization
//     int[] dp;
//     public int climb(int i){
//         if(i == 1 || i == 2) return i;
//         if(dp[i] != -1) return dp[i];
//         // int ans = climb(i-1) + climb(i-2);
//         // dp[i] = ans;
//         // return ans;      these 3 line same to dp[i] = climb(i-1) + climb(i-2);

//         return dp[i] = climb(i-1) + climb(i-2);
//     }
//     public int climbStairs(int n) {
//         dp = new int[n+1];
//         Arrays.fill(dp,-1);

//         return climb(n);
//     }
// }
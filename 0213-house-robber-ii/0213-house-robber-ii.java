class Solution {  // Bottom Up DP (Tabulation) || Time - O(n) | Space - O(1)
    public int robRange(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int ans1 = robRange(nums, 1, n-1); // remove first
        int ans2 = robRange(nums, 0, n-2); // remove last

        return Math.max(ans1, ans2);
    }
}


// class Solution {  // Top Down DP (Memoization)  || Time - O(n) | Space - O(n)
//     int[] dp;
//     public int loot(int i,int[] arr){ // helper
//         if(i >= arr.length) return 0;
//         if(dp[i] != -1) return dp[i];

//         int pick = arr[i] + loot(i+2,arr);
//         int skip = loot(i+1,arr);

//         int ans = Math.max(pick,skip);
//         dp[i] = ans;

//         return ans;
//     }
//     public int rob(int[] nums) { // main func
//         if(nums.length == 1) return nums[0];

//         int n = nums.length;
//         dp = new int[n];
//         Arrays.fill(dp,-1);
//         int[] arr1 = new int[n-1];
//         int[] arr2 = new int[n-1];

//         int k=0;
//         for(int i=1;i<n;i++){ // remove first element 
//             arr1[k++] = nums[i];
//         }
//         for(int i=0;i<n-1;i++){ // remove last element
//             arr2[i] = nums[i];
//         }

//         int ans1 = loot(0,arr1);
//         Arrays.fill(dp,-1);
//         int ans2 = loot(0,arr2);

//         return Math.max(ans1,ans2);
//     }
// }

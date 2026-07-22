class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int k = 0;  // we can take it or not will be good 

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];

            nums[k++] = sum; // instead using k we can use simply nums[i] = sum;
        }
        return nums;
    }
}
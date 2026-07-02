class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int k = 0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];

            nums[k++] = sum;
        }
        return nums;
    }
}
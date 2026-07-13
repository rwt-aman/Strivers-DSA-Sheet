class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum += nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(leftsum * 2 == totalsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum += nums[i];
        }

        for(int i=0;i<nums.length;leftsum += nums[i++]){
            if(leftsum * 2 == totalsum - nums[i]) return i;
        }
        return -1;
    }
}
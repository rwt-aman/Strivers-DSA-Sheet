class Solution {
    public int findMin(int[] nums) {
        int srt = 0;
        int end = nums.length -1;

        while(srt < end){
            int mid = srt + (end - srt) / 2;

            if(nums[mid] > nums[end]){ // min in right side
                srt = mid + 1;
            }
            else{ // min in left side
                end = mid;
            }
        }
        return nums[srt];
    }
}
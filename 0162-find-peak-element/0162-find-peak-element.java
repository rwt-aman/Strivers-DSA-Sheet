class Solution {
    public int findPeakElement(int[] nums) {
        int srt = 0;
        int end = nums.length-1;

        while(srt < end){
            int mid = srt + (end - srt) / 2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                srt = mid + 1;
            }
        }
        return srt;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int srt = 0;
        int end = nums.length-1;

        while(srt <= end){
            int mid = srt + (end - srt) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if( nums[mid] < target){
                srt = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
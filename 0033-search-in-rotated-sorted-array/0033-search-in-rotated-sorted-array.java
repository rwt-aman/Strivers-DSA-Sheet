class Solution {
    public int search(int[] nums, int target) {
        int srt =0;
        int end =nums.length-1;

        while(srt<=end){
            int mid = srt + (end - srt) / 2;

            if(nums[mid] == target){
                return mid;
            }
            
            // if left sorted
            if(nums[srt] <= nums[mid]){
                if(nums[srt] <= target && target <= nums[mid]){
                    end = mid - 1;
                }
                else{
                    srt = mid + 1;
                }
            }
            // if right sorted
            else{
                if(nums[mid] <= target && target <= nums[end]){
                    srt = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
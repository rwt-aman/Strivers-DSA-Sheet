class Solution {
    public boolean search(int[] nums, int target) {
        int srt = 0;
        int end = nums.length-1;

        while(srt <= end){
            int mid = srt + (end - srt) / 2;

            if(nums[mid] == target) return true;

            if(nums[srt] == nums[mid] && nums[mid] == nums[end]){
                srt++;
                end--;
            }
            else if(nums[mid] >= nums[srt]){ // left sorted
                if(target >= nums[srt] && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    srt = mid + 1;
                }
            }
            else{ // right sorted
                if(target > nums[mid] && target <= nums[end]){
                    srt = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean search(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == target) return true;
//         }
//         return false;
//     }
// }
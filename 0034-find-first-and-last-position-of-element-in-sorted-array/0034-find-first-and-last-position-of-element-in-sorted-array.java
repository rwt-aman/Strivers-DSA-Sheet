class Solution {
    public int firstposition(int[] nums,int target){
        int srt = 0;
        int end = nums.length-1;
        int result = -1;

        while(srt <= end){ // left searching for 1st occurence
            int mid = srt + (end - srt) / 2;

            if(nums[mid] == target){
                result = mid;
                end = mid -1;
            }
            else if(nums[mid] < target){
                srt = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }

    public int lastposition(int[] nums,int target){
        int srt = 0;
        int end = nums.length-1;
        int result = -1;

        while(srt <= end){ // right searching for last occurence
            int mid = srt + (end - srt) / 2;

            if(nums[mid] == target){
                result = mid;
                srt = mid + 1;;
            }
            else if(nums[mid] < target){
                srt = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = firstposition(nums,target);
        int last = lastposition(nums,target);

        return new int[]{first,last};
    }
}
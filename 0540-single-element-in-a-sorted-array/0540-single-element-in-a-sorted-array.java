// using binary search

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int srt = 0;
        int end = nums.length-1;

        while(srt < end){
            int mid = srt + ( end - srt) / 2;

            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){
                srt = srt + 2;
            }
            else{
                end = mid;
            }
        }
        return nums[srt];
    }
}


// using hash map

// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             int num = nums[i];
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         for(int num:nums){
//             if(map.get(num) == 1) return num;
//         }
//         return -1;
//     }
// }
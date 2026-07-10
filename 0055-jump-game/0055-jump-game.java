class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int final_pos = n-1;

        for(int i=n-2;i>=0;i--){
            if(i + nums[i] >= final_pos){
                final_pos = i;
            }
        }
        return final_pos == 0;
    }
}



// class Solution {
//     public boolean canJump(int[] nums) {
//         int reachable = 0;

//         for(int i=0;i<nums.length;i++){
//             if(i > reachable){
//                 return false;
//             }
//             reachable = Math.max(reachable,i+nums[i]);
//         }
//         return true;
//     }
// }
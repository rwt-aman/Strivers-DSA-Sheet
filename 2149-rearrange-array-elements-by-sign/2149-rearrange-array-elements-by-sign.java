class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posidx = 0; // positive index
        int negidx = 1; // negative index

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[posidx] = nums[i];
                posidx += 2;
            }
            else{
                ans[negidx] = nums[i];
                negidx += 2;
            }
        }
        return ans;
    }
}

// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] arr1 = new  int[n/2]; // positive
//         int[] arr2 = new int [n/2]; // negative

//         int p = 0,q = 0;

//         for(int i=0;i<n;i++){
//             if(nums[i] > 0){
//                 arr1[p++] = nums[i];
//             }
//             else{
//                 arr2[q++] = nums[i];
//             }
//         }
//         int i = 0,j = 0, k = 0;
//         while(i < arr1.length && j < arr2.length){
//             nums[k++] = arr1[i++]; // positive
//             nums[k++] = arr2[j++]; // negative
//         }
//         return nums;
//     }
// }
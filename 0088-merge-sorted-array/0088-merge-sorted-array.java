class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m + n -1;
        int i = m - 1;
        int j = n - 1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[idx--] = nums1[i--];
            }
            else{
                nums1[idx--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[idx--] = nums2[j--];
        }
    }
}



// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = 0;
//         int j = 0;
//         int[] temp = new int[m+n];
//         int k = 0;

//         while(i < m && j < n){
//             if(nums1[i] <= nums2[j]){
//                 temp[k++] = nums1[i++];
//             }
//             else{
//                 temp[k++] = nums2[j++];
//             }
//         }

//         while(i < m){
//             temp[k++] = nums1[i++];
//         }
//         while(j < n){
//             temp[k++] = nums2[j++];
//         }

//         for(int idx=0;idx<temp.length;idx++){
//             nums1[idx] = temp[idx];
//         }
//     }
// }

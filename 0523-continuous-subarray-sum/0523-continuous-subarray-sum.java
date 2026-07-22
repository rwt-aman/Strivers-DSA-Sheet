class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0; // Prifix sum

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum % k;

            if(map.containsKey(rem)){
                if(i-map.get(rem) >= 2) return true;
            }
            else{
                map.put(rem,i);
            }
        }
        return false;
    }
}



// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         // Brute force TLE expected
//         for(int i=0;i<nums.length;i++){
//             int sum = 0;
//             for(int j=i;j<nums.length;j++){
//                 sum += nums[j];

//                 if(sum % k == 0){
//                     if((j-i+1 >= 2)) return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
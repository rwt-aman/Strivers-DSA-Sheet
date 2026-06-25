class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Count frequency
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Check for majority (> n/3)
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > n / 3) {
        //         result.add(entry.getKey());
        //     }
        // }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Map.Entry<Integer, Integer>[] entries = entrySet.toArray(new Map.Entry[0]);

        for (int i = 0; i < entries.length; i++) {
            Map.Entry<Integer, Integer> entry = entries[i];

            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
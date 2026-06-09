import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        // Stores: number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < nums.length; i++) {

            // Find the number needed to reach target
            int need = target - nums[i];

            // Check if the needed number was already seen
            if (map.containsKey(need)) {

                // Pair found
                // Return index of needed number and current index
                return new int[] { map.get(need), i };
            }

            // Store current number and its index
            // so future elements can use it
            map.put(nums[i], i);
        }

        // No pair found (usually not reached in LeetCode)
        return new int[] { -1, -1 };
    }
}
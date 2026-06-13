class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
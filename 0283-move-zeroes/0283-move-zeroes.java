class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        // 1. Fixed syntax: changed 'int[n]' to 'new int[n]'
        int[] nz = new int[n]; 
        int[] z = new int[n];
        
        // 2. Fixed logic: variables must be initialized to 0 before use
        int j = 0; 
        int k = 0; 
        
        for(int i = 0; i < n; i++) {
            // 3. Fixed logic: if it's 0, it belongs in the 'z' array
            if(nums[i] == 0) {
                z[k++] = nums[i];
            }
            // 4. Fixed logic: if it's NOT 0, it belongs in the 'nz' array
            if(nums[i] != 0) {
                nz[j++] = nums[i];
            }
        }

        // 5. COMBINE WITHOUT LOOPS: Copy back into the original 'nums' array
        // Copy non-zeros (nz) from index 0 to j into the beginning of nums
        System.arraycopy(nz, 0, nums, 0, j);
        
        // Copy zeros (z) from index 0 to k right after the non-zeros
        System.arraycopy(z, 0, nums, j, k);
    }
}

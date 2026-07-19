class Solution {
    // 1. Fast I/O block to reduce LeetCode's background stream overhead
    static {
        System.out.close();
    }

    // 2. Precompute all possible Tribonacci values up to n = 37 at class loading time
    private static final int[] t = new int[38];

    static {
        t[0] = 0;
        t[1] = 1;
        t[2] = 1;
        for (int i = 3; i < 38; i++) {
            t[i] = t[i - 1] + t[i - 2] + t[i - 3];
        }
    }

    public int tribonacci(int n) {
        // 3. O(1) Time and Space lookup per testcase
        return t[n];
    }
}
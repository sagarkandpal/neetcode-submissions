class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            // i >> 1 shifts the bits right (equivalent to i / 2)
            // i & 1 checks if the last bit is a 1 (equivalent to i % 2)
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}

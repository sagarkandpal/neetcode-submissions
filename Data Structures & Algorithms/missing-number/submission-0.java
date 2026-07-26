class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length; // Start with 'n' because the loop only runs up to n-1
        
        for (int i = 0; i < nums.length; i++) {
            res ^= i ^ nums[i]; // XOR the index and the value
        }
        
        return res;
    }
}

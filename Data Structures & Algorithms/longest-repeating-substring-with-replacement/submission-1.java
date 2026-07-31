

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int maxCount = 0; // Tracks the frequency of the most frequent character in the current window
        int maxLength = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            
            // Update maxCount with the frequency of the current character
            maxCount = Math.max(maxCount, map.get(currentChar));

            // Current window size = (right - left + 1)
            // Characters to change = (window size - maxCount)
            // If replacements needed > k, shrink the window from the left
            if ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            // Update the maximum length of valid window found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
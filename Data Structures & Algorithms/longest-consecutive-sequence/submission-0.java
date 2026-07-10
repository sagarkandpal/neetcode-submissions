class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) set.add(num);

        int longestStreak = 0;
        for(int num: nums){

            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentStreak++;
                    currentNum++;
                }

                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }

        return longestStreak;
    }
}












class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        //Put all numbers in HashSet
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            // Check if num is the Start of a sequence
            if(!set.contains(num - 1)){
                int currentNum = num;
                int count = 1;

                // While checking next consecitive number
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

    return longest;
    }
}

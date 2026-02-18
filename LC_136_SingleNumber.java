// Problem: Single Number
// LeetCode No: 136
// Approach: Bit Manipulation (XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}

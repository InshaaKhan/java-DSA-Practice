// Problem: House Robber
// LeetCode No: 198
// Approach: Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0; // max till previous house
        int prev2 = 0; // max till house before previous

        for (int num : nums) {
            int temp = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = temp;
        }

        return prev1;
    }
}

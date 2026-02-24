// Problem: Length of Last Word
// LeetCode No: 58
// Approach: Reverse Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

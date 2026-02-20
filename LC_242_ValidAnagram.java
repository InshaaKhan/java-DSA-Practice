// Problem: Valid Anagram
// LeetCode No: 242
// Approach: Frequency Count
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int num : count) {
            if (num != 0) return false;
        }

        return true;
    }
}

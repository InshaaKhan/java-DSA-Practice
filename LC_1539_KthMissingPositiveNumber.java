// Problem: Kth Missing Positive Number
// LeetCode No: 1539
// Approach: Linear Scan
// Time Complexity: O(n + k)
// Space Complexity: O(1)

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int current = 1;
        int i = 0;

        while (k > 0) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                if (k == 0) return current;
            }
            current++;
        }
        return current;
    }
}

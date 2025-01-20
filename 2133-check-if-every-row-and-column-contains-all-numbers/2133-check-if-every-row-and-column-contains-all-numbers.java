class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        // Check rows
        for (int i = 0; i < n; i++) {
            if (!isValid(matrix[i], n)) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = matrix[i][j];
            }
            if (!isValid(column, n)) {
                return false;
            }
        }

        return true;
    }

    // Helper function to check if an array contains all integers from 1 to n without duplicates
    private boolean isValid(int[] array, int n) {
        boolean[] seen = new boolean[n + 1];
        for (int num : array) {
            if (num < 1 || num > n || seen[num]) {
                return false;
            }
            seen[num] = true;
        }
        return true;
    }
}
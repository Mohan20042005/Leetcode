class Solution {
    public int splitNum(int num) {
        // Convert the number to a character array
        char[] arr = String.valueOf(num).toCharArray();
        
        // Sort the array to get digits in ascending order
        Arrays.sort(arr);
        
        int num1 = 0, num2 = 0, n = arr.length;
        
        // Distribute digits alternatively into num1 and num2
        for (int i = 0, j = 1; i < n; i += 2, j += 2) {
            num1 = num1 * 10 + (arr[i] - '0');  // Add digit at even index to num1
            if (j < n)
                num2 = num2 * 10 + (arr[j] - '0');  // Add digit at odd index to num2
        }
        
        // Return the sum of both numbers
        return num1 + num2;
    }
}
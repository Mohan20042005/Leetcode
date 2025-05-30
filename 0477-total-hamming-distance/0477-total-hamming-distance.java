class Solution {
    public int totalHammingDistance(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int distance = 0;
        for (int i = 0; i < 32; i++) {
            int one_count = 0;
            for (int j = 0; j < nums.length; j++) {
                one_count += (nums[j] >> i) & 1;
            }
            distance += one_count * (nums.length - one_count);
        }
        return distance;
    }
}
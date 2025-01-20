class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> n = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) c++;
            else {
                n.add(c);
                c = 0;
            }
        }
        n.add(c);
        int max = Collections.max(n);
        return max;
    }
}
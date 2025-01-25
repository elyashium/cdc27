class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = n*(n+1)/2;

        int s2 = 0;
        for (int i : nums) {
            s2 = s2 + i;
        }
        return sum - s2;
    }

}
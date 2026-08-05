class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + digits(nums[i]);
        }
        return count;
    }

    public int digits(int a) {
        int i = 0;
        while (a > 0) {
            i++;
            a = a / 10;
        }
        if (i % 2 == 0)
            return 1;
        else
            return 0;
    }
}
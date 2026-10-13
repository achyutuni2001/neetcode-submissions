
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int p = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, p - 1);
        reverse(nums, p, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            left++;
            right--;
        }
    }
}

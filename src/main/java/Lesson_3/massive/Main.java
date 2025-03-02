package Lesson_3.massive;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2};
        System.out.println(max(nums));
        System.out.println(min(nums));
        System.out.println(sum(nums));
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
package Lesson_3.Two_number;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 9, 8,5,86,6};
        System.out.println(cur(nums));
        System.out.println(look(nums));
    }

    public static int cur(int[] nums) {
        int sum = 10;
        int cur = nums[0];
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];
                if (a + b == sum) {
                    cur = a;
                }
            }
        return cur;
    }

    public static int look(int[] nums) {
        int sum = 10;
        int look = nums[0];
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i];
                int b = nums[j];
                if (a + b == sum) {
                    look = b;
                }
            }
        return look;
    }
}
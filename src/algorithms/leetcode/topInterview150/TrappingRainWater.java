package algorithms.leetcode.topInterview150;

public class TrappingRainWater {

//    Given n non-negative integers representing an elevation map where the width of each bar is 1,
//    compute how much water it can trap after raining.

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }


    public static int trap(int[] height) {
        int length = height.length;
        int portionSize = 0;
        int waterSize = 0;
        int leftIndex = 0;
        int rightIndex = length - 1;
        for (int i = 1; i < length; i++) {
            if (height[i] > 0 && height[leftIndex] == 0) {
                leftIndex = i;
                continue;
            }
            if (height[i] < height[leftIndex]) {
                portionSize += height[leftIndex] - height[i];
            } else if (height[i] >= height[leftIndex]) {
                rightIndex = i;
                waterSize += portionSize;
                portionSize = 0;
                leftIndex = rightIndex;
            }
        }
        return waterSize;
    }
}

package medium;

public class ContainerWithMostWater {

    // Leetcode 11.

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minimumHeight = Math.min(height[left], height[right]);
            int area = minimumHeight * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater mostWater = new ContainerWithMostWater();
        int[] height = {1,1};

        System.out.println(mostWater.maxArea(height));
    }
}

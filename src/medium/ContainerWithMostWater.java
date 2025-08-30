package medium;

public class ContainerWithMostWater {

    // Leetcode 11.

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area;
            if (height[left] < height[right]) {
                area = height[left] * (right - left);
                maxArea = Math.max(maxArea, area);
                left++;
            } else {
                area = height[right] * (right - left);
                maxArea = Math.max(maxArea, area);
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

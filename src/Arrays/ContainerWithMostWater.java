package Arrays;

public class ContainerWithMostWater {
    public static int maxWater(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxWater = 0;

        while (i < j) {
            int minHt = Math.min(heights[i], heights[j]);
            int width = j-1;
            int area = minHt * width;

            maxWater = Math.max(maxWater, area);

            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(heights));
    }
}

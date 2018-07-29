package leetcode;

class ContainerWithMostWater {
    /*Given n non-negative integers a1, a2, ..., an , 
     * where each represents a point at coordinate (i, ai). 
     * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
     * Find two lines, which together with x-axis forms a container, 
     * such that the container contains the most water.
        Note: You may not slant the container and n is at least 2.
     *
     * Example:
            Input: [1,8,6,2,5,4,8,3,7]
            Output: 49
     */

    ContainerWithMostWater() {
    }

    public int algorithm(int[] height) {

        return 0;
    }

    public int bruteForce(int[] height) {
        int left, right;
        int width;
        int area, max_area;
        
        max_area = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                width = j - i;
                if(height[i] < height[j]) {
                    area = width * height[i];
                } else {
                    area = width * height[j];
                }
                if(area > max_area) {
                    max_area = area;
                }
            }
        }
        return max_area;
    }
}

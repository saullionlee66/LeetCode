package TwoPointers.ContainerWithMostWater11;
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
public class Solution {
    public int maxArea(int[] height){
        //two pointers
        //calculate the area to replace the maxArea
        //if the left pointer value is less than the right pointer value
        //meaning for maximize the area, the left pointer can move forward, otherwise the right pointer can move backwards
        int maxA = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int A = w * h;
            maxA = Math.max(maxA, A);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxA;
    }
}

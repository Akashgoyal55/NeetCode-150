package TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {

    }
    public int trap(int[] height) {
        //we will do pre-processing, create two arrays left to rigt (putting max) and right to left (putting max each time)
        int n = height.length;

        int[] left = new int[n]; //left array
        int[] right = new int[n]; //right array

        left[0] = height[0]; //first element will be same from the height array
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){ //right array from right to left storing max value each time
            right[i] = Math.max(right[i+1], height[i]);
        }

        int maxArea = 0;

        //final traverse through the array to find the min out of this two array and subtract with the current block
        for(int i=0; i<n; i++){
            maxArea += Math.min(left[i], right[i]) - height[i];
        }
        return maxArea;

    }
}

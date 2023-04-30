package Arrays;

public class TrappedRainWater {

    public static int[] getLeftMax(int heights[]) {
        int[] leftMax = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            if (i == 0) {
                leftMax[i] = heights[i];
            } else {
                // Here we can use Math.max to calculate max b/w Math.max(leftMax[i - 1] ,
                // heights[i])
                if (leftMax[i - 1] > heights[i]) {
                    leftMax[i] = leftMax[i - 1];
                } else {
                    leftMax[i] = heights[i];
                }
            }
        }
        return leftMax;
    }

    public static int[] getRightMax(int heights[]) {
        int rightMax[] = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            if (i == heights.length - 1) {
                rightMax[i] = heights[i];
            } else {
                // Here we can use Math.max to calculate max b/w Math.max(rightMax[i - 1] ,
                // heights[i])
                if (rightMax[i + 1] > heights[i]) {
                    rightMax[i] = rightMax[i + 1];
                } else {
                    rightMax[i] = heights[i];
                }
            }
        }
        return rightMax;
    }

    public static int CalcTrappedWater(int heights[]) {
        int trappedWater = 0;
        if (heights.length < 3) {
            return -1;
        } else {
            int leftMax[] = getLeftMax(heights);
            int rightMax[] = getRightMax(heights);
            for (int i = 0; i < heights.length; i++) {
                int minimumVal = Math.min(leftMax[i], rightMax[i]);
                trappedWater += (minimumVal - heights[i]);
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        int trappedWater = CalcTrappedWater(heights);
        if (trappedWater == -1) {
            System.out.println("No Water can be trapped. Tp trap water we must have atleast 3 heights");
        } else {
            System.out.println(" The toatal volume of water trapped: " + trappedWater);
        }
    }
}

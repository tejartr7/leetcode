class Solution {
    public int largestRectangleArea(int[] heights) {
      int res = 0;
        for (int i = 0; i < heights.length; i++){
            if (i > 0 && heights[i] == heights[i - 1]) continue;

            int left = i, right = i;
            while (left >= 0 && heights[left] >= heights[i])
                left--;

            while (right < heights.length && heights[right] >= heights[i])
                right++;
            res = Math.max(res, (right - left - 1) * heights[i]);
        }
        return res;
        
    }
}
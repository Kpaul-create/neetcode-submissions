class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int area=0;
        int max=0;
        while(l<r){
            int height=Math.min(heights[l],heights[r]);
            int width=r-l;
            area=width*height;
            max=Math.max(max,area);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}

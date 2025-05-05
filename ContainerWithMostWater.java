class Solution {
    public int maxArea(int[] height) {
        int maxHeight=0;
        int left=0,right=height.length-1;
       while(left<right){
                int width=right-left;
                int boundryHeight=Math.min(height[left],height[right]);
                int area=width*boundryHeight;
                maxHeight=Math.max(maxHeight,area);
                if(height[left]<height[right]){
                    left++;
                }else{
                    right--;
                }
            }
        return maxHeight;
    }
}
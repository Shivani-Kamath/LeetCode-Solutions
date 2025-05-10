class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int a=-1,b=-1;
        while(left<=right){
            if(nums[left]==target && a==-1){
                a=left;
            }    
            if(nums[right]==target && b==-1){
                b=right;
            }
            if(a!=-1 && b!=-1) {
                break;
            }
            if(a==-1) left++;
            if(b==-1) right--;
        }
        return new int[]{a,b};
    }
}
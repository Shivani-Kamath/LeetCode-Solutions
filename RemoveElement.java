class Solution {
    public int removeElement(int[] nums, int val) {
    int left,right=0;

    for(left=0;left<nums.length;left++){
        if(nums[left]!=val){
            nums[right]=nums[left];
            right++;
        }
    }

    return right;
    }
}
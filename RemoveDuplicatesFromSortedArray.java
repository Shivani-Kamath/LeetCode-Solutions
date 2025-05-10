class Solution {
    public int removeDuplicates(int[] nums) {
    int left,right=0,count=0;
    for(left=1;left<nums.length;left++){
        if(nums[left]!=nums[right]){
        right++;
        nums[right]=nums[left];
        }
    }
    return right+1;
    }
}

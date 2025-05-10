class Solution {
    public int searchInsert(int[] nums, int target) {
    int pos=0,i;
    for(i=0;i<nums.length;i++){
        if(nums[i]==target){
           pos= i;
           break;
        }
        else{
         if(nums[i]<target)
            pos=i+1;

        }
           
    }
    return pos;
    }
}
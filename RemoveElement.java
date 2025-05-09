int removeElement(int* nums, int numsSize, int val) {
    int left,right=0;

    for(int left=0;left<numsSize;left++){
        if(nums[left]!=val){
            nums[right]=nums[left];
            right++;
        }
    }

    return right;


}
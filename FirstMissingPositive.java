class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int num:nums){
            h.add(num);
        }
        for(int i=1;i<=nums.length+1;i++){
          if(!h.contains(i)){
            return i;
          }
        }
        return -1;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int k=0;
        double nums3[]=new double[nums1.length+nums2.length];
        int length=nums1.length+nums2.length;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i++];
            }
            else
                nums3[k++]=nums2[j++];
        }
        while(i<nums1.length ){
            nums3[k++]=nums1[i++];
        }
          while(j<nums2.length ){
            nums3[k++]=nums2[j++];
        }

        if(length%2==1) {
            return nums3[length/2];
        } else{ 
            return (nums3[length/ 2-1]+nums3[length/2])/2.0;
        }
    }
}
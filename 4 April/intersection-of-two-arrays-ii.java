class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int[] arr=new int[nums2.length];

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                arr[k++]=nums1[i];
                i++;j++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }else
            {
                i++;
            }

        }
        return Arrays.copyOfRange(arr,0,k);
    }
}

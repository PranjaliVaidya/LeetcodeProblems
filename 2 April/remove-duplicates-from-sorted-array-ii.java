class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=2;
        for(int i=2;i<n;i++)  
        {
           if(nums[i]!=nums[j-2]) //if j-2 is not same as i.Will not increment j until we found mismatched number to replace 3rd consecutive same num
           {
                nums[j]=nums[i];
                j++;              //Move jth index for checking j-2 index
           }

           //i will increment if i==j-2 index
        }
        return j;
    }
}

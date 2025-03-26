class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3)
        {
            return nums[n-1];
        }
         
         int j=1;
         for(int i = n - 2; i >= 0; i--)
         {
            if(nums[i]!=nums[i+1])
            {
                //nums[j]=nums[i];
                j++;
            }
            if(j==3)
            {
                return nums[i];
            }
         }
      
      return nums[n-1];
    }
}

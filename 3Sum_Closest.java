class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum=Integer.MAX_VALUE/2;
        for(int i=0;i<nums.length-2;i++)
        {
            int s=i+1;
            int e=nums.length-1;
            
            while(s<e)
            {
                int curr_sum=nums[i]+nums[s]+nums[e];
                if(Math.abs(curr_sum-target)<Math.abs(closest_sum-target))
                {
                    closest_sum=curr_sum;
                }
                if(curr_sum>target)
                {
                    e--;
                }
                else if(curr_sum<target)
                {
                    s++;
                }
                else if(curr_sum==target)
                {
                    return curr_sum;
                }
            }
        }

        return closest_sum;
    }
}

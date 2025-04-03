class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;

        if(nums.length==0)
        {
            return 0;
        }
        
        int maxi=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int diff=nums[i+1]-nums[i];
           if(nums[i]!=nums[i+1]){
                if(diff==1)
                {
                    c++;

                }else{
                    maxi=Math.max(maxi,c);
                    c=1;
                }
            }
            
        }
        return Math.max(maxi,c);
    }
}

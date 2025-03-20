class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int j=0;

        for(int i=0;i<nums.length;i++)
        {
            j=i;
            while(j+1<nums.length && nums[j+1]==(nums[j]+1) )
            {
               j++;
            }
            if(j>i)
            {
                list.add(nums[i]+"->"+nums[j]);
            }
            else
            {
                list.add(String.valueOf(nums[i]));
            }

            i=j;
        }
        return list;
    }
}

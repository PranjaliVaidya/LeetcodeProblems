class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
         List<List<Integer>> list=new ArrayList<>();
         Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
            int ans=nums[i]+nums[start]+nums[end];
            if(ans==0)
            {
                 s.add(Arrays.asList(nums[i],nums[start],nums[end]));
                 start++;
                 end--;
            }
            else if(ans>0)
            {
                end--;
            }
            else{
                start++;
            }
            }
        }

        for(List<Integer> l : s)
        {
             list.add(l);
        }
        return list;
    }
}

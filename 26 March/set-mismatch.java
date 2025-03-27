class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int duplicate=0;
        int missing=0;
        for(int i=1;i<=n;i++)
        {
            if (map.containsKey(i)) {
            if(map.get(i)==2)
            {
                duplicate=i;
            }
            }
            else if(map.get(i)==null)
            {
                missing=i;
            }
        }
        
        return new int[]{duplicate,missing};
    }
}

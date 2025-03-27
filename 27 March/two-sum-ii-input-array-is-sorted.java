class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  HashMap<Integer,Integer> map=new HashMap<>();
        //  int[] arr=new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     int ans=target-nums[i];
        //     if(map.containsKey(ans))
        //     {
        //         arr[0]=i+1;
        //         arr[1]=map.get(ans)+1;
        //          Arrays.sort(arr);
        //          return arr;
        //     }
        //     map.put(nums[i],i);
        // }
        // return new int[]{};

        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int total=nums[l]+nums[r];
            if(total==target)
            {
                return new int[]{l+1,r+1};
            }
            if(total>target)
            {
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{};
    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--)
        {
            num[i]=num[i]+k;
            k=num[i]/10;
            num[i]=num[i]%10;
            list.add(0,num[i]);
        }
        while(k>0)
        {
            list.add(0,k%10);
            k=k/10;
        }
        return list;
    }
}

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] answer=new String[n];
        HashMap<Integer,String> map=new HashMap<>();
        int[] temp = Arrays.copyOf(score, n);
       
        Arrays.sort(temp);
        int j=1;
        for(int i=n-1;i>=0;i--)
        {
            if(j==1)
            {
                map.put(temp[i],"Gold Medal");
            }
            else if(j==2)
            {
                map.put(temp[i],"Silver Medal");
            }
            else if(j==3)
            {
                map.put(temp[i],"Bronze Medal");
            }else{
                map.put(temp[i],String.valueOf(j));
            }
            j++;
        }
        for(int i=0;i<n;i++)
        {
            answer[i]=map.get(score[i]);
        }
       return answer; 
    }
}

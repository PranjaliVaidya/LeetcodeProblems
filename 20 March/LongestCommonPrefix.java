class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String e=strs[strs.length-1];

        StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==e.charAt(i))
            {
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }
       
        return sb.toString();
    }
}

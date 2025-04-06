class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word=s.split(" ");
        if(word.length!=pattern.length())
        {
            return false;
        }

        Map<String,Integer> wordMap=new HashMap<>();
        Map<Character,Integer> patternMap=new HashMap<>();

        for(Integer i=0;i<word.length;i++)
        {
            if(patternMap.putIfAbsent(pattern.charAt(i),i)!=wordMap.putIfAbsent(word[i],i))
            {
                return false;
            }
        }
        return true;
    }
}

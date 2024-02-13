class Solution {
    public int prefixCount(String[] words, String pref) {
        int preCount = 0;
        
        for (String word: words)
        {
            if(word.length() >= pref.length())
            {
                if(word.substring(0, pref.length()).compareTo(pref) == 0)
                {
                    preCount++;
                }
            }
        }
        return preCount;
    }
}
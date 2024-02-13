class Solution {
    public int prefixCount(String[] words, String pref) {
        int preCount = 0;
        String subWord = "";
        for (String word: words)
        {
            if(word.length() >= pref.length())
            {
                subWord = word.substring(0, pref.length());
                if(subWord.compareTo(pref) == 0)
                {
                    preCount++;
                }
            }
        }
        return preCount;
    }
}
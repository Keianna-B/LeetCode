class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        s = "";

        for (String word: words)
        {
            for(int i = word.length()-1; i >= 0; i--){
                s = s + word.charAt(i);
            }
            s += " "; 
        }
        s = s.substring(0, s.length()-1);

        return s;
    }
}
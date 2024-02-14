class Solution {
    public String firstPalindrome(String[] words) {
        String palindrome = "";

        for(String word : words)
        {
            for(int i = 0; i < word.length(); i++){
                palindrome = word.charAt(i) + palindrome;
            }
            if(palindrome.compareTo(word) == 0){
                break;
            }
            else{
                palindrome = "";
            }
        }
        return palindrome;
    }
}
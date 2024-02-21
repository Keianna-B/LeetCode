class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> charSet = new HashSet<>();
        int left = 0, longestLength = 0;
        for(int right = 0; right < s.length(); right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                longestLength = Math.max(longestLength,right-left+1);
            }
            else{
                while(s.charAt(left) != s.charAt(right)){
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.remove(s.charAt(left));left++;
                charSet.add(s.charAt(right));
            }
            
        }
        return longestLength;
    }
}
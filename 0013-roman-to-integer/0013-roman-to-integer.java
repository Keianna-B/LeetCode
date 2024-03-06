class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> key = new HashMap<>();
        
        key.put('I', 1);
        key.put('V', 5);
        key.put('X', 10);
        key.put('L', 50);
        key.put('C', 100);
        key.put('D', 500);
        key.put('M', 1000);

        int ans = 0, i = 0;

        for(i = 0; i < s.length(); i++)
        {
            if (key.get(s.charAt(i)) < key.get(s.charAt(i+1)))
            {
                ans -= key.get(s.charAt(i));
            }
            else
            {
                ans += key.get(s.charAt(i));
            }
        }
        
        return ans;
    }
}
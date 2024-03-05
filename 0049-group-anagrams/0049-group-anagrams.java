class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> strings = new ArrayList<String>();
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        }
        List<List<String>> answer = new ArrayList<>();
        answer.addAll(anagrams.values());
        
        return answer;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String words:strs){
            char[] word = words.toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(words);
        }
        return new ArrayList(map.values());
    }
}
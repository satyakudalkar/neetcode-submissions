class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> inRes = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        List<String> strings = new ArrayList<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            strings.add(String.valueOf(chars));
        }
        for(int i=0;i<strs.length;i++){
            List<String> list = map.getOrDefault(strings.get(i),new ArrayList<>());
            list.add(strs[i]);
            map.put(strings.get(i), list);
        }
        map.forEach((key, value) -> {
            res.add(value);
        });
        return res;
    }
}

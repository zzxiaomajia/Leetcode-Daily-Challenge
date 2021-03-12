
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            // corner case

            if (strs.length == 0) {
                return new ArrayList();
            }
            Map<String, List> res = new HashMap<String, List>();
            for (String s : strs){
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String key = String.valueOf(ch);
                if(!res.containsKey(key)){
                    res.put(key, new ArrayList());
                }
                res.get(key).add(s);
            }
            return new ArrayList(res.values());

        }
    }

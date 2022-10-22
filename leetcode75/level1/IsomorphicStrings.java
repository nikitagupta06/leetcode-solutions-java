// 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        String k = "", j = "";
        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (mapS.containsKey(ch)) {
                k += Integer.toString(mapS.get(ch));
            } else {
                mapS.put(ch, ++count);
                k += Integer.toString(count);
            }
        }
        count = 0;
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (mapT.containsKey(ch)) {
                j += Integer.toString(mapT.get(ch));
            } else {
                mapT.put(ch, ++count);
                j += Integer.toString(count);
            }
        }
        
        return k.equals(j);
    }
}
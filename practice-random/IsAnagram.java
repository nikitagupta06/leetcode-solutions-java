import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        
    }
    public static boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        
        if (l1 != l2) return false;
        
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for(int i = 0; i < l1; i++) {
            char c = s.charAt(i);
            if (mapS.containsKey(c)) {
                int val = mapS.get(c);
                mapS.put(c, val+1);
            } else {
                mapS.put(c, 1);
            }
        }
        
        for(int i = 0; i < l2; i++) {
            char c = t.charAt(i);
            if (mapT.containsKey(c)) {
                int val = mapT.get(c);
                mapT.put(c, val+1);
            } else {
                mapT.put(c, 1);
            }
        }
        
        if (mapS.equals(mapT)) return true;
        
        return false;
    }
    
}
// 392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.isEmpty() && t.isEmpty() || s.isEmpty() || s == t) return true;
        int k = 1;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(k-1)) {                
                if (k == s.length()) {
                    return true; 
                }
                k++;
            }
        }
        return false;     
    }
}
// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count = 0;
        boolean isOdd = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val%2 == 0){
                count+= val;
            } else {
                isOdd = true;
                count += val-1;
            }
        }
        if (isOdd) count++;
        return count;
    }
}
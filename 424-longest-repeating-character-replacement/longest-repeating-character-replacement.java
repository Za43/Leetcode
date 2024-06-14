class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen = 0;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> alpha = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            alpha.putIfAbsent(s.charAt(i), 0);
            alpha.put(s.charAt(i), alpha.get(s.charAt(i))+1);
            int cur = Collections.max(alpha.values());
            while (right - left - cur +1 > k){
                alpha.put(s.charAt(left), alpha.get(s.charAt(left))-1);
                left++;
                cur = Collections.max(alpha.values());
            }
            maxlen = Math.max(maxlen, right-left+1);
            right++;
        }
        return maxlen;
    }
}
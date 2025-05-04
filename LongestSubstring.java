class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        HashSet<Character>h=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            
            while(h.contains(ch)){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(ch);
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}
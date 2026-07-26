class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0;
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
           if(!set.contains(s.charAt(i)))
           {set.add(s.charAt(i));
           count++;
           }
           else 
           {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l++));
                count--;
            }
            set.add(s.charAt(i));
            count++;
           }
           
           max=Math.max(max,count);
        }
        return max;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
       char[] a = s.toCharArray();
       Arrays.sort(a);
       char[] b = t.toCharArray();
       Arrays.sort(b);
       if (Arrays.equals(a, b)){
        return true;
       }
       return false;

    }
}

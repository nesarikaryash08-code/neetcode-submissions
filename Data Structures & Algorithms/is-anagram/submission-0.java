class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] intArr = new int[123];
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            intArr[sArr[i]]=intArr[sArr[i]]+1;
            intArr[tArr[i]]=intArr[tArr[i]]-1;
        }
        for(int i = 96;i<123;i++){
            if(intArr[i]!=0)return false;
        }
        return true;
    }
}

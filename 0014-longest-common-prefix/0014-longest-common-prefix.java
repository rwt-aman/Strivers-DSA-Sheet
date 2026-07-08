class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String ans = "";
        int i = 0;
        int minLength = Math.min(strs[0].length(), strs[strs.length - 1].length());

        while(i < minLength){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                ans += strs[0].charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        return ans;
    }
}
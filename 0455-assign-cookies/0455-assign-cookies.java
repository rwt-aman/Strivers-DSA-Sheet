class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, i = 0, j = 0 ;
        int s_size = s.length;
        int g_size = g.length;

        while(j < s_size && i < g_size){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
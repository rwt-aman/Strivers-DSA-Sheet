class Solution {
    public int maxDepth(String s) {
        int currentdepth = 0;
        int maxdepth = 0;

        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);

            if(ch == '('){
                currentdepth++;
                maxdepth = Math.max(maxdepth,currentdepth);
            }
            else{
                if(ch == ')'){
                    currentdepth--;
                }
            }
        }
        return maxdepth;
    }
}
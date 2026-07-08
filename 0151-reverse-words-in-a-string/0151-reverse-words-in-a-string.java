class Solution {
    public String reverseWords(String s) {
        char[] arr = new StringBuilder(s).reverse().toString().toCharArray();
        int n = arr.length;
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<n;i++){
            String word = "";

            while(i < n && arr[i] != ' '){
                word += arr[i];
                i++;
            }
            word = new StringBuilder(word).reverse().toString();

            if(word.length() > 0){
                ans.append(word+" ");
            }
        }
        return ans.toString().trim();
    }
}
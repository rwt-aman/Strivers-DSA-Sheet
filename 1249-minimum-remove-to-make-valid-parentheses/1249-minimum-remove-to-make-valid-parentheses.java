class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Character> st = new Stack<>();

        int leftcount = 0;
        int rightcount = 0;

        // First pass
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                leftcount++;
                st.push(ch);
            }
            else if (ch == ')') {

                if (rightcount + 1 > leftcount) {
                    continue;
                }

                rightcount++;
                st.push(ch);
            }
            else {
                st.push(ch);
            }
        }

        // Second pass
        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {

            char ch = st.pop();

            if (ch == '(' && leftcount > rightcount) {
                leftcount--;
                continue;
            }

            result.append(ch);
        }

        return result.reverse().toString();
    }
}
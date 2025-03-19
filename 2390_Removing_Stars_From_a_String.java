class Solution {
    public String removeStars(String s) {

        ArrayList<Character> stack = new ArrayList<Character>();
        char[] charArray = s.toCharArray();
        for(Character c : charArray){
            if(c == '*'){
                stack.remove(stack.size() - 1);
            }else{
                stack.add(c);
            }
        }

        StringBuilder b = new StringBuilder();

        for(Character c : stack){
            b.append(c);
        }

        return b.toString();



        //much slower solution :)
        // Stack<Character>st = new Stack<Character>();

        // for(int i = 0;i<s.length();i++){

        //     if(s.charAt(i) == '*'){
        //         Character c = st.pop();
        //     }else{
        //         st.push(s.charAt(i));
        //     }
        // }

        // String answer = "";

        // while(!st.empty()){
        //     answer += st.pop();
        // }

        // String reversed = "";

        // for(int i = answer.length() - 1;i>=0;i--){
        //     reversed += answer.charAt(i);
        // }

        // return reversed;



    }
}

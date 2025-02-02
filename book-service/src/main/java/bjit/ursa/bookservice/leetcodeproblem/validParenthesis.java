package bjit.ursa.bookservice.leetcodeproblem;

import org.hibernate.internal.util.collections.Stack;

public class validParenthesis {
    public boolean isValid(String s) {

        Stack<Character> valid = new Stack<>() {
            @Override
            public void push(Character character) {

            }

            @Override
            public Character pop() {
                return null;
            }

            @Override
            public Character getCurrent() {
                return null;
            }

            @Override
            public int depth() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        for(char c : s.toCharArray()){
            if(c == '(') valid.push(')');
            else if(c == '{' ) valid.push('}');
            else if(c == '[') valid.push(']');
            else if(valid.isEmpty() || valid.pop() != c) return false;
        }
        return valid.isEmpty();


    }
}

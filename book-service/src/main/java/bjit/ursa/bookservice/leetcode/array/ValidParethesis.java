package bjit.ursa.bookservice.leetcode.array;

import bjit.ursa.bookservice.datastructures.stack.Stack;

public class ValidParethesis {
    public boolean isValid(String s) {

        Stack<Character> valid = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') valid.push(')');
            else if(c == '{' ) valid.push('}');
            else if(c == '[') valid.push(']');
            else if(valid.isEmpty() || valid.pop() != c) return false;
        }
        return valid.isEmpty();


    }
}

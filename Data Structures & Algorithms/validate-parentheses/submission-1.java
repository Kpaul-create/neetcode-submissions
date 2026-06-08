public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) return false;

        // Map closing brackets to opening brackets
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) { // It's a closing bracket
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            } else { // It's an opening bracket
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}

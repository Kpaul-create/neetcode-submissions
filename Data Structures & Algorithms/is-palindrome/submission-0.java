class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev=new StringBuilder(s1).reverse().toString();
        return rev.equals(s1);
    }
}

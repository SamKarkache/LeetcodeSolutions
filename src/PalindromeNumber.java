class SolutionPalindrome {
    public boolean isPalindrome(int x) {
        String forward = ((Integer) x).toString();
        String backwards = "";

        for(int i = forward.length() - 1; i >= 0; i--) {
            backwards = backwards.concat(((Character) forward.charAt(i)).toString());
        }
        return backwards.equals(forward);
    }
}
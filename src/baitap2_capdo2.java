public class baitap2_capdo2 {
    public static boolean isPalindrome(String str) {
        int left = 0;

        for(int right = str.length() - 1; left < right; --right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            ++left;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
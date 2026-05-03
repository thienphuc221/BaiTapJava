public class bai5_capdo1 {
    public static String getFirstLetters(String str) {
        String result = "";
        boolean isWord = false;

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (!isWord) {
                    result = result + c + " ";
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(getFirstLetters("Xin chào các bạn"));
        System.out.println(getFirstLetters("Hello World"));
    }
}

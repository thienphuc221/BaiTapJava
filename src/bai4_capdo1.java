public class bai4_capdo1 {
    public static int countWords(String str) {
        int count = 0;
        boolean isWord = false;

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (!isWord) {
                    ++count;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Xin chào các bạn"));
        System.out.println(countWords("Hello World"));
    }
}

public class bai1_capdo1 {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = xoaNguyenAm(input);
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi sau khi xóa nguyên âm: " + result);
    }

    public static String xoaNguyenAm(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (!isNguyenAm(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static boolean isNguyenAm(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}

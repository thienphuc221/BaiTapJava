public class baitap3_capdo2 {
    public static String removeDuplicates(String str) {
        String result = "";

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            boolean isDuplicate = false;

            for(int j = 0; j < result.length(); ++j) {
                if (result.charAt(j) == c) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
        System.out.println(removeDuplicates("abca"));
    }
}
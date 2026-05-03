import java.util.HashMap;

public class baitap3_capdo3 {
    public static String minWindow(String s, String t) {
        if (s.length() != 0 && t.length() != 0) {
            HashMap<Character, Integer> map = new HashMap();

            for(char c : t.toCharArray()) {
                map.put(c, (Integer)map.getOrDefault(c, 0) + 1);
            }

            int left = 0;
            int right = 0;
            int formed = 0;
            int required = map.size();
            HashMap<Character, Integer> window = new HashMap();
            int minLen = Integer.MAX_VALUE;

            int start;
            for(start = 0; right < s.length(); ++right) {
                char c = s.charAt(right);
                window.put(c, (Integer)window.getOrDefault(c, 0) + 1);
                if (map.containsKey(c) && (Integer)window.get(c) == (Integer)map.get(c)) {
                    ++formed;
                }

                for(; left <= right && formed == required; ++left) {
                    char ch = s.charAt(left);
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }

                    window.put(ch, (Integer)window.get(ch) - 1);
                    if (map.containsKey(ch) && (Integer)window.get(ch) < (Integer)map.get(ch)) {
                        --formed;
                    }
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
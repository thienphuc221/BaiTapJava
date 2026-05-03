public class bait2_capdo1 {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        } else {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; ++i) {
                int num = arr[i];
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num < max && num > secondMax) {
                    secondMax = num;
                }
            }

            return secondMax;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 0, 2};
        System.out.println(findSecondLargest(arr));
    }
}

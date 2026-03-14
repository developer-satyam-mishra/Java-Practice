class ThirdMaximum {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            if ((first != null && num == first) ||
                (second != null && num == second) ||
                (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = (long) num;
            } 
            else if (second == null || num > second) {
                third = second;
                second = (long) num;
            } 
            else if (third == null || num > third) {
                third = (long) num;
            }
        }

        int result = (third == null) ? first.intValue() : third.intValue();

        System.out.println("Third Maximum Number: " + result);
    }
}
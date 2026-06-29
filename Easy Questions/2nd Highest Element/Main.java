class Main {
    public static void main(String[] args) {

        int[] nums = {5, 4, 3, 2};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secondMax);
    }
}
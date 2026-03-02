public class JumpGame {

    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int far = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (i == end) {
                jumps++;
                end = far;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        JumpGame sol = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + sol.jump(nums));
    }
}
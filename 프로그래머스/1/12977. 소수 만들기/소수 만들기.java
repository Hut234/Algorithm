import java.util.Arrays;
class Solution {
    private static int answer = 0;
    private static boolean[] eratos = new boolean[3000];
    public int solution(int[] nums) {
        Arrays.fill(eratos, true);
        for(int i=2; i<=Math.sqrt(3000); i++) {
            if (eratos[i]) {
                for(int j=i*2; j<3000; j+=i) {
                    eratos[j] = false;
                }
            }
        }
        recur(0, nums, 0, 0);

        return answer;
    }
    public static void recur(int cnt, int[] nums, int start, int sum) {
        if (cnt == 3) {
            if (eratos[sum]) answer++;
            return;
        }
        
        for(int i=start; i<nums.length; i++) {
            recur(cnt+1, nums, i+1, sum+nums[i]);
        }
        
    }
}
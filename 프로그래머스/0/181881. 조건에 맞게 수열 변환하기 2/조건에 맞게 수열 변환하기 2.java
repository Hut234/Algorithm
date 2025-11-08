class Solution {
    public int solution(int[] arr) {
        int[] prev = arr;
        
        int answer = 0;
        int len = arr.length;
        while (true) {
            answer++;
            int[] cur = new int[len];
            for (int i = 0; i < len; i++) {
                int val;
                if (prev[i] % 2 == 0) {
                    if (prev[i] < 50) {
                        val = prev[i];
                    } else {
                        val = prev[i] / 2;
                    }
                } else {
                    if (prev[i] < 50) {
                        val = prev[i] * 2 + 1;
                    } else {
                        val = prev[i];
                    }
                }
                cur[i] = val;
            }
            if (isSame(prev, cur)) {
                break;
            }
            prev = cur;
        }
        return answer - 1;
    }
    private boolean isSame(int[] prev, int[] cur) {
        int len = prev.length;
        boolean flag = true;
        for (int i = 0; i < len; i++) {
            if (prev[i] != cur[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
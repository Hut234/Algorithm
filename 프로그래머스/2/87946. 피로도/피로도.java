class Solution {
    private static int length;
    private static int result;
    private static int[][] dungeons;
    private static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        Solution.length = dungeons.length;
        Solution.dungeons = dungeons;
        Solution.visited = new boolean[length];

        recur(0, k, 0);
        return result;
    }

    private static void recur(int idx, int fatigue, int cnt){
        // 피로도가 1미만
        if (fatigue < 1) return;
        // 방문수
        if (cnt > result) result = cnt;
        // base case
        if (idx == length) return;

        for (int i = 0; i < length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) continue;
            visited[i] = true;
            recur(idx+1, fatigue -dungeons[i][1], cnt+1);
            visited[i] = false;
            recur(idx+1, fatigue, cnt);
        }
    }
}
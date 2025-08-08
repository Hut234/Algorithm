class Solution {
    
    static int answer;
    static int size;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        size = dungeons.length;
        visited = new boolean[size]; 
        dfs(dungeons, 0, 0, k);
        return answer;
    }
    
    void dfs(int[][] dungeons, int depth, int count, int energy) {
        if (depth == size) {
            answer = Integer.max(answer, count);
            return;
        }
        
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;
            
            visited[i] = true;
            if (energy >= dungeons[i][0]) {
                dfs(dungeons, depth + 1, count + 1, energy - dungeons[i][1]);
            } else {
                dfs(dungeons, depth + 1, count, energy);
            }
            visited[i] = false;
        }
    }
    
}
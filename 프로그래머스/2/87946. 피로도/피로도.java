class Solution {
    static int k;
	static int len;
	static int[][] tmp;
	static int result;
	static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
    	Solution.k = k;
    	Solution.len = dungeons.length;
    	Solution.tmp = dungeons;
    	Solution.visited = new boolean[len];
    	recur(0, k, 0);
        return result;
    }
    
    private static void recur(int idx, int p, int cnt) {
    	if (p < 1) return;
    	if (result < cnt) result = Integer.max(result, cnt);
    	if (idx == len) return;
    	
    	for (int i = 0; i < len; i++) {
    		if(!visited[i] && tmp[i][0] <= p) {
    			visited[i] = true;
    			recur(idx+1, p-tmp[i][1], cnt+1);
    			visited[i] = false;
    			recur(idx+1, p, cnt);
    		}
    	}
    }
}
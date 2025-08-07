import java.util.*;

class Solution {
    
    static List<Integer>[] graph;
    public int solution(int n, int[][] wires) {
        graph = new List[n + 1];
       
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            int s = wires[i][0];
            int e = wires[i][1];                
            graph[s].add(e);
            graph[e].add(s);
        }
        
        int answer = n;
        for (int i = 0; i < n - 1; i++) {
            int s = wires[i][0];
            int e = wires[i][1];         
            
            // left = solve(), right n - solve(), diff = Math.abs(left - right)
            answer = Integer.min(answer, Math.abs(solve(s, e) * 2 - n));
        }
        
        return answer;
    }
    
    int solve(int next, int before) {
        int cnt = 1;        
        
        for (Integer val : graph[next]) {
            if (val == before) continue;
            cnt += solve(val, next);
        }
        
        return cnt;
    }
    
}
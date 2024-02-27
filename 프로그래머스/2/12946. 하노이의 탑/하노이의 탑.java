import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	private static List<Integer[]> al = new ArrayList<>();
    private static void recur(int n, int s, int e) {
		
		if(n==0) return;
		recur(n-1, s, 6 - (s+e));
		al.add(new Integer[]{s, e});
		recur(n-1, 6 - (s+e), e);
	}
    public int[][] solution(int n) {
		
    	recur(n, 1, 3);
    	
    	int[][] result = new int[al.size()][2];
    	for (int i = 0; i < al.size(); i++) {
    		result[i] = Arrays.stream(al.get(i)).mapToInt(Integer::intValue).toArray();
		}
    	
        return result;
    }
}
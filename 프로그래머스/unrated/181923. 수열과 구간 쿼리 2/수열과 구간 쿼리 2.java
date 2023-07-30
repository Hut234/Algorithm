import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s, e, c;
		int[] result = new int[queries.length];
        Arrays.fill(result, -1);
		for(int i=0; i<queries.length; i++) {
			s = queries[i][0];
			e = queries[i][1];
			c = queries[i][2];
			for(int j=s; j<=e; j++) {
				if(arr[j]>c) {
					if(result[i]==-1) result[i] = arr[j];
					else result[i] = Integer.min(result[i], arr[j]);
				}
			}
		}
		return result;
    }
}
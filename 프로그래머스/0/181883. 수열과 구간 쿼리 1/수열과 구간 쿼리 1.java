class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int start = query[0]; start <= query[1]; start++) {
                arr[start]++;
            }
        }
        return arr;
    }
}
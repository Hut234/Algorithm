class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        for(int i=0, j=result.length-1; i<result.length; i++,j--) result[i] = num_list[j];
        return result;
    }
}
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int mid = 0;
        for(int i=1; i<food.length; i++) {
            food[i] /= 2;
            mid += food[i];
            for(int j=0; j<food[i]; j++) {
                sb.append(i);
            }
        }
        return sb.toString().concat("0").concat(sb.reverse().toString());
    }
}
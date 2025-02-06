class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] strArray = String.valueOf(array[i]).split("");
            for(int j = 0; j < strArray.length; j++) {
                if ("7".equals(strArray[j])) answer++;
            }
        }
        
        return answer;
    }
}
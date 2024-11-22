class Solution {
    public int solution(String s) {
        String[] numStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = s.replace(numStr[0], "0");
        for (int i=1; i<10; i++) {
            result = result.replace(numStr[i], String.valueOf(i));
        }
        
        return Integer.parseInt(result);
    }
}
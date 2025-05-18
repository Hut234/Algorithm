class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[length];
        for (int i = 0, start = 0; i < length; i++, start += n) {
			answer[i] = my_str.substring(start, start + n > my_str.length() ? my_str.length() : start + n);
        }
        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int prev = 0;
        char[] chars = my_string.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= '0' && chars[i] <= '9') {
				if (i < chars.length - 1 && chars[i + 1] >= '0' && chars[i + 1] <= '9') {
					prev = prev * 10 + (chars[i] - '0');
				} else {
					if (prev != 0) prev *= 10;
					answer = answer + prev + (chars[i] - '0');
					prev = 0;
				}

			}
		}

        return answer;
    }
}
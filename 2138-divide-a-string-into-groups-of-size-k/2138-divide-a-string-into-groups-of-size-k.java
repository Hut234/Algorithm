class Solution {
    public String[] divideString(String s, int k, char fill) {
		int modulo = s.length() % k;
		int quotient  = s.length() / k;
		int length = modulo == 0 ? quotient : quotient + 1;
		String[] result = new String[length];
		for (int i = 0; i < length; i++) {
			result[i] = s.substring(i * k, Integer.min(i * k + k, s.length()));
		}

		if (s.length() % k != 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < k - (s.length() % k); i++) sb.append(fill);
			result[length - 1] += sb.toString();
		}

		return result;
    }
}
class Solution {
    public String solution(String polynomial) {
        String answer = "";
		String[] values = polynomial.split("\\+");
		int confficient = 0;
		int consts = 0;
		for (String value : values) {
			String trim = value.trim();
			if(trim.contains("x")) {
				if(trim.indexOf("x") == 0) {
					confficient += 1;
				} else {
					confficient += Integer.parseInt(trim.substring(0, trim.indexOf("x")));
				}
			} else {
				consts += Integer.parseInt(trim);
			}
		}

		if (confficient != 0) {
			if (confficient != 1) answer += confficient + "x";
			else answer += "x";
		}

		if (answer.length() != 0) {
			if (consts != 0) {
				answer += " + " + consts;
			}
		} else {
			answer = "" + consts;
		}

		return answer;
    }
}
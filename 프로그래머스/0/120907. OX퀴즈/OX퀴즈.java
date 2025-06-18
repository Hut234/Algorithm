class Solution {
    public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] expression = quiz[i].split("=");
			String[] ls = new String[2];
			String operator = null;
			if(!expression[0].contains("+")) {
				int idx = expression[0].indexOf("-", 1);
				ls[0] = expression[0].substring(0, idx);
				ls[1] = expression[0].substring(idx + 1);
				operator = "-";
			} else {
				ls = expression[0].split("\\+");
				operator = "+";
			}
			int a = Integer.parseInt(ls[0].trim());
			int b = Integer.parseInt(ls[1].trim());
			int response = operator.equals("+") ? a + b : a - b;
			int result = Integer.parseInt(expression[1].trim());
			answer[i] = response == result ? "O" : "X";
		}
		return answer;
    }
}
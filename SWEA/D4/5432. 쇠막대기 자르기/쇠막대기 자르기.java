import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < testCaseCount; i++) {
            String[] splitByLaser = br.readLine().split("\\(\\)");

            int answer = 0;
            int prevLeftBracketCount = 0;
            for (String brackets : splitByLaser) {
                int currentLeftBracketCount = 0;
                String[] separatedBrackets = brackets.split("");
                for (int j = 0; j < separatedBrackets.length; j++) {
                    if ("(".equals(separatedBrackets[j])) currentLeftBracketCount++;
                    else if (")".equals(separatedBrackets[j]))prevLeftBracketCount--;
                }
                answer += currentLeftBracketCount *2 +prevLeftBracketCount;
                prevLeftBracketCount += currentLeftBracketCount;
            }
            stringBuilder.append("#")
                    .append(i+1)
                    .append(" ")
                    .append(answer)
                    .append("\n");
        }

        System.out.print(stringBuilder);
    }
}
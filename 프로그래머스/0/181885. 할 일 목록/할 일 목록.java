class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        for (boolean flag : finished) {
            if (!flag) count++;
        }
        String[] answer = new String[count];
        for (int i = 0, idx = 0; i < todo_list.length; i++) {
            if (finished[i]) continue;
            answer[idx++] = todo_list[i];
        }
        return answer;
    }
}
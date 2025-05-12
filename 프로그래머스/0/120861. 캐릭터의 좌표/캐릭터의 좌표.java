class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int N = board[0];
        int M = board[1];
        
        int x = 0, y = 0;
        // -N/2 ~ M/2
        for(int i = 0; i < keyinput.length; i++) {
            String direction = keyinput[i];
            
            if (direction.equals("up")) {
                if (y < M / 2) y += 1;
            } else if (direction.equals("down")) {
                if (y > - M / 2) y -= 1;
            } else if (direction.equals("left")) {
                if (x > - N / 2) x -= 1;
            } else {
                if (x < N / 2) x += 1;
            }         
        }
        
        return new int[] {x, y};
    }
}
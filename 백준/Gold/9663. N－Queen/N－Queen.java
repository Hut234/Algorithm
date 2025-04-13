import java.io.*;

class Main {
    
    static int N;
    static int result;
    static int[] columns;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        columns = new int[N + 1];
        
        recur(1);
        System.out.print(result);    
    }
    
    static void recur(int row) {
        if (row == N + 1) result++;
        else {
             for (int column = 1; column <= N; column++) {
                 boolean isPossible = true;
                 
                 for (int row2 = 1; row2 < row; row2++) {
                     int column2 = columns[row2];
                     if (isAttackable(row, column, row2, column2)) {
                         isPossible = false;
                         break;
                     }
                 }
                 
                 if (isPossible) {
                     columns[row] = column;
                     recur(row + 1);
                     columns[row] = 0;
                 }
                 
             }
        }
    }
    
    static boolean isAttackable(int row, int column, int row2, int column2) {
        return column == column2 || row2 - column2 == row - column || row2 + column2 == row + column;
    }
}
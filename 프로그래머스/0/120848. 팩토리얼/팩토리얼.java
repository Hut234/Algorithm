class Solution {
    
    static int[] factorial = new int[11];
    
    public int solution(int n) {
        factorial(10);
        
        int answer = 0;
        for (int i = 10; i > 0; i--) {
            if (factorial[i] <= n) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    
    static int factorial(int number) {
        if (number < 2) return 1;        
        return factorial[number] = number * factorial(number - 1);      
    }
    
}
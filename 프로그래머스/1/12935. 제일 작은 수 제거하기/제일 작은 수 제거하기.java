class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if(arr.length==1) {
            answer = new int[arr.length];
            answer[0] = -1;
        } else {
            answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]<min) {
                    min = arr[i];
                }
            }
            
            for(int i=0, j=0; i<arr.length; i++) {
                if(arr[i]==min) continue;
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}
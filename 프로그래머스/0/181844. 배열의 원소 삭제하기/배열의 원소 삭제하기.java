import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> listA = new ArrayList<>();
        int lenA = arr.length;
        for (int i = 0; i < lenA; i++) {
            listA.add(arr[i]);
        }
        
        int len = delete_list.length;
        for (int i = 0; i < len; i++) {
            int idx = listA.indexOf(delete_list[i]);
            if (idx != -1) {
                listA.remove(idx);
            }
        }
        
        
        return listA;
    }
}
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Integer> arr = new ArrayList<>();
        
        int idx = 0;  // 추출 기준용
        int idx2 = 0; // 정렬 기준용
        
        if (ext.equals("code")) { idx = 0; }
        if (ext.equals("date")) { idx = 1; }
        if (ext.equals("maximum")) { idx = 2; }
        if (ext.equals("remain")) { idx = 3; }
        
        if (sort_by.equals("code")) { idx2 = 0; }
        if (sort_by.equals("date")) { idx2 = 1; }
        if (sort_by.equals("maximum")) { idx2 = 2; }
        if (sort_by.equals("remain")) { idx2 = 3; }
        
        for (int[] d : data) {
            if (d[idx] >= val_ext) { // 기준보다 크면 패스
                continue;
            }
            else {
                arr.add(d[idx2]);
            }
        }
        
        Collections.sort(arr);
        
        int[][] answer = new int[arr.size()][4];
        int index = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[j][idx2] == arr.get(i)) {
                    answer[index] = data[j];
                    index++;
                }
            }
        }
        
        return answer;
    }
}
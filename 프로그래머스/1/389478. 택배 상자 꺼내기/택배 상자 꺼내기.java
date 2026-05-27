import java.util.ArrayList;

class Solution {
    public int solution(int n, int w, int num) {
        ArrayList<Integer>[] boxes = new ArrayList[w];
        
        for (int i = 0; i < w; i++) boxes[i] = new ArrayList<>();
        
        int idx = 0;
        int flag = 1;
        
        for (int j = 1; j <= n; j++) {
            boxes[idx].add(j);
            
            if (flag == 1) idx++;
            else idx--;
            
            if (idx < 0 || idx == w) {
                if (idx < 0) idx++;
                if (idx == w) idx--;
                
                flag *= -1;
            }
        }
        
        for (int a = 0; a < w; a++) {
            for (int b = 0; b < boxes[a].size(); b++) {
                if (boxes[a].get(b) == num) {
                    return boxes[a].size() - b;
                }
            }
        }
        
        return 0;
    }
}
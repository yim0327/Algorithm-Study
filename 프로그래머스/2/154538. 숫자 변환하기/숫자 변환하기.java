import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {y, 0});
        
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            if (arr[0] < x) continue;
            if (arr[0] == x) {
                return arr[1];
            }
            
            if (arr[0] % 3 == 0) q.offer(new int[] {arr[0]/3, arr[1]+1});
            if (arr[0] % 2 == 0) q.offer(new int[] {arr[0]/2, arr[1]+1});
            if (arr[0] - n >= x) q.offer(new int[] {arr[0]-n, arr[1]+1});
        }

        return -1;
    }
}
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        // 우선순위 큐(최소 힙) 초기화
        for (int i = 0; i < scoville.length; i++) {
            minHeap.add(scoville[i]);
        }
        
        if (minHeap.peek() >= K) return 0;
        
        for (int i = 0; i < scoville.length; i++) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            minHeap.add(second * 2 + first);
            answer++;
            
            if (minHeap.size() <= 1 || minHeap.peek() >= K) break;
        }
        
        if (minHeap.size() == 1 && minHeap.poll() < K) return -1;
        
        return answer;
    }
}
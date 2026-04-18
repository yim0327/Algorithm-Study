import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            
            if (pq.size() <= k) {
                answer[i] = pq.peek();
            }
            else {
                pq.remove();
                answer[i] = pq.peek();
            }
        }
        
        return answer;
    }
}
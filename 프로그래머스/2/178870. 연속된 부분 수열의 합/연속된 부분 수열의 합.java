class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[] {-1, -1};
        
        int head; int tail; int tValue; int sum;
        head = tValue = sum = 0;
        tail = -1;
        
        int hValue = sequence[0];
        
        while (head < sequence.length) {
            // head를 움직여야할 때
            if (tail == sequence.length-1 || sum > k) {
                head++;
                sum -= hValue;
                if (head < sequence.length) {
                    hValue = sequence[head];
                }
            }
            // tail을 움직여야할 때
            else if (tail < sequence.length-1) {
                tail++;
                tValue = sequence[tail];
                sum += tValue;
            }
            
            if (sum == k &&
                ((answer[0] == -1 && answer[1] == -1)
                || (answer[1]-answer[0] > tail - head))) {
                answer[0] = head;
                answer[1] = tail;
            }
        }
        
        return answer;
    }
}
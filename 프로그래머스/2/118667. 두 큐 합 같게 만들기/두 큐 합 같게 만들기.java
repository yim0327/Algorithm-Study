class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int q_len = queue1.length;

        long total = 0;
        long sum = 0;

        int[] union = new int[q_len * 2];

        for (int i = 0; i < q_len; i++) {
            union[i] = queue1[i];
            union[q_len + i] = queue2[i];

            sum += queue1[i];
            total += (long) queue1[i] + queue2[i];
        }

        if (total % 2 != 0) return -1;

        long target = total / 2;

        int left = 0;
        int right = q_len;

        int count = 0;

        while (count <= q_len * 4) {
            if (sum == target) return count;

            if (sum > target) {
                sum -= union[left % (q_len * 2)];
                left++;
            } else {
                sum += union[right % (q_len * 2)];
                right++;
            }

            count++;
        }

        return -1;
    }
}
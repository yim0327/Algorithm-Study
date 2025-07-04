class Solution {
    public int[] solution(int[] arr, int k) {
        int idx = 0;
        for(int i : arr){
            arr[idx] = (k % 2 == 0 ? i+k : i*k);
            idx++;
        }
        return arr;
    }
}
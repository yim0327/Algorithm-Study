class Solution {
    public int solution(int balls, int share) {
        int[] num = {2, 3, 4, 5, 6, 7, 8, 9};
        long x = 1;
        long y = 1;

        for(int i = 0; i < (balls-share); i++){
            x *= balls - i;
            y *= (balls-share) - i;

            for(int j = 0; j < 8; j++){
                if(x % num[j] == 0 && y % num[j] == 0){
                    x = x / num[j];
                    y = y / num[j];
                }
            }
        }

        return (int)(x/y);
    }
}
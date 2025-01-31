import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int[] num = new int[6];
        
        num[a-1]++;
        num[b-1]++;
        num[c-1]++;
        num[d-1]++;
        
        int i = 0;
        while(num[i] == 0){i++;}
        
        if(num[i] == 4){ // 1 (pppp)
            answer = 1111*(i+1);
        }
        else if(num[i] == 3){
            int j = i+1;
            while(num[j] == 0){j++;}

            if(num[j] == 1){ // 2 (pppq)
                int tmp = 10 *(i+1) + (j+1);
                answer = (int)Math.pow(tmp, 2);
            }
        }
        else if(num[i] == 2){
            int j = i+1;
            while(num[j] == 0){j++;}

            if(num[j] == 2){ // 3 (ppqq)
                answer = (i+1 + j+1) * Math.abs(i-j);
            }
            else{ // 4 (ppqr)
                if(num[j] == 1){
                    answer *= (j+1);
                }

                int k = j+1;
                while(num[k] == 0){k++;}

                if(num[k] == 1){
                    answer *= (k+1);
                }
            }
        }
        else if(num[i] == 1){
            int j = i+1;
            while(num[j] == 0){j++;}

            if(num[j] == 2){ // 4 (qppr)

                int k = j+1;
                while(num[k] == 0){k++;}

                answer = (i+1) * (k+1);
            }
            else if(num[j] == 3){ // 2 (qppp)
                int tmp = 10 *(j+1) + (i+1);
                answer = (int)Math.pow(tmp, 2);
            }
            else{
                int k = j+1;
                while(num[k] == 0){k++;}

                if(num[k] == 2){ // 4 (qrpp)
                    answer = (i+1) * (j+1);
                }
                else{ // 5 (pqrs)
                    answer = i+1;
                }
            }
        }
        
        return answer;
    }
}
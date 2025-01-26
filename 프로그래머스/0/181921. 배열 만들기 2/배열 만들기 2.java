import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        int t = 0;
        
        int[] arr = {5, 50, 55, 500, 505, 550, 555, 5000, 5005,5050,5055,5500,
                    5505, 5550, 5555, 50000, 50005, 50050, 50055, 50500, 50505,
                     50550,50555, 55000, 55005, 55050, 55055, 55500, 55505,
                     55550, 55555, 500000, 500005, 500050, 500055, 500500, 
                     500505, 500550, 500555, 505000, 505005, 505050, 505055,
                    505500, 505505, 505550, 505555, 550000, 550005, 550050,
                    550055, 550500, 550505, 550550, 550555, 555000, 555005,
                    555050, 555055, 555500, 555505, 555550, 555555};
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= l && arr[i] <= r){
                answer.add(arr[i]);
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        int[] tmp = new int[answer.size()];
        
        for(int j = 0; j < answer.size(); j++){
            tmp[j] = answer.get(j).intValue();
        }
        
        return tmp;
    }
}
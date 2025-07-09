import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int idx = 0;
        int x = 0;
        int y = 0;

        for(int i : numlist){
            x = Math.abs(i - n); // numlist 기준값
            
            if(idx == 0){
                arr.add(i);
            }
            else{
                for(int j = 0; j < arr.size(); j++){ // arr배열 검색
                    y = Math.abs(arr.get(j) - n); // arr 기준값
                    if(x < y || (x == y && i > arr.get(j))){ 
                        arr.add(j, i);
                        break; // 삽입했으면, 다음 i값으로 탈출
                    }
                    if(j == arr.size()-1){
                        arr.add(i);
                        break;
                    }
                }
            }
            
            idx ++;
        }
        
        return arr.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}


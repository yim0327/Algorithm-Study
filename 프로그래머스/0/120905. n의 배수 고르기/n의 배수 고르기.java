import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numlist){
            if(i % n == 0){
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}
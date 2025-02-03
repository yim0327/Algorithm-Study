import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(n == 1){
            for(int i = 0; i <= slicer[1]; i++){
                arr.add(num_list[i]);
            }
        }
        if(n == 2){
            for(int i = slicer[0]; i < num_list.length; i++){
                arr.add(num_list[i]);
            }
        }
        if(n == 3){
            for(int i = slicer[0]; i <= slicer[1]; i++){
                arr.add(num_list[i]);
            }
        }
        if(n == 4){
            for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2]){
                arr.add(num_list[i]);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            answer[j] = arr.get(j);
        }
        
        return answer;
    }
}
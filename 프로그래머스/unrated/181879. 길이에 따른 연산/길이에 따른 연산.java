class Solution {
    public int solution(int[] num_list) {
        int answer = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                answer += num_list[i];
            }
            else {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}
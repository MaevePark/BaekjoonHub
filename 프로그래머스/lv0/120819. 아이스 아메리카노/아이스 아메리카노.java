class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2]; // 배열 선언

        answer[0] = money/5500;
        answer[1] = money%5500;
        
        return answer;
    }
}

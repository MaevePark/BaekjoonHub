class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i <= 6 * n; i++) {
            if(i * 6 % n == 0) { // 6의 배수 확인
                answer = i;
                break;
            }
        }
        return answer;
    }
}
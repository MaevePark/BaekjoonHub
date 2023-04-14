class Solution {
    public int solution(int n) {
       
        int answer = 0;
        
        if (n % 7 == 0) { // 입력한 사람의 n값을 7로 나누었을때 0이라면
            answer = n / 7;  // n/7의 몫 만큼 피자 주문
        } else {
            answer = n / 7 + 1; // 나머지가 있을 경우 피자를 1개 더 추가
        }    
        return answer;
    }
}
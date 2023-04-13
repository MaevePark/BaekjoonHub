class Solution {
    public int solution(int[] array, int height) {
        int result = 0;

        for (int i = 0; i < array.length; i++) { // array 배열 길이 만큼 반복
            if (array[i] > height) { // 머쓱이의 키 보다 크면 result를 하나씩 증가 시켜서 카운팅 해줌
                result++;
            }
        }
        return result;
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replaceAll(letter, ""); // 문자열 치환 replaceAll(기존, 바뀔 문자)
        return answer;
    }
}
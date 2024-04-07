class Solution {
    public int[] solution(String[] strlist) {
        
       int[] answer = new int[strlist.length];
        
        // for-each 루프를 올바르게 사용합니다.
        int i = 0; // 배열 인덱스를 위한 변수
        for(String str : strlist) {
            // 각 문자열의 길이를 배열에 저장합니다.
            answer[i++] = str.length();
        }
        return answer;
    }
}
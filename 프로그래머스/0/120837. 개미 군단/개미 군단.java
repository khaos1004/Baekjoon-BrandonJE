class Solution {
    public int solution(int hp) {
        // 장군개미로 나눈 몫
        int general = hp / 5;
        // 장군개미로 나눈 나머지
        int remainder = hp % 5;
        
        // 병정개미로 나눈 몫
        int soldier = remainder / 3;
        // 병정개미로 나눈 나머지
        remainder = remainder % 3;
        
        // 일개미의 수는 나머지
        int worker = remainder;
        
        // 총 개미의 수
        int answer = general + soldier + worker;
        return answer;
    }
}
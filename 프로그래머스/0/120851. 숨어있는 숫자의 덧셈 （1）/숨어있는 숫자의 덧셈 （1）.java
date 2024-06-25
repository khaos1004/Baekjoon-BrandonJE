import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return my_string.chars() // 문자열을 IntStream으로 변환
                        .filter(Character::isDigit) // 숫자인 문자만 필터링
                        .map(Character::getNumericValue) // 문자를 숫자로 변환
                        .sum(); // 숫자들의 합을 계산
    }
}
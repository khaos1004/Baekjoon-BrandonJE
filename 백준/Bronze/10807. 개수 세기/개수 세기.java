import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();                 // 배열의 길이 N 입력 받기
        int[] arr = new int[N];               // 배열 생성, 길이는 N만큼

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();            // 배열에 입력한 정수들 넣어주기
        }
        int b = sc.nextInt();                 // [문제] 입력 세번째 줄 정수

        // 스트림을 사용하여 b와 일치하는 요소의 개수를 세기
        long count = IntStream.of(arr)        // 배열을 스트림으로 변환
                              .filter(x -> x == b)  // b와 일치하는 요소 필터링
                              .count();             // 조건에 맞는 요소의 개수 세기

        System.out.println(count);
    }
}
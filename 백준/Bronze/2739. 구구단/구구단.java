import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int A = num.nextInt();

        IntStream.rangeClosed(1, 9) // 1부터 9까지의 숫자 스트림 생성
                 .forEach(i -> System.out.printf("%d * %d = %d\n", A, i, A * i)); // 각 i에 대해 곱셈 결과 출력
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; ++i) { // 줄 반복
            for (int j = 1; j <= n - i; ++j) { 
                System.out.print(" "); // 공백 넣어 주기
            }
            for (int j = 1; j <= i; ++j) { // 별 반복 i의 증가수 만큼 별 갯수 증가
                System.out.print("*"); // 별 찍기
            }
            System.out.println(); // 별 찍기후에 줄 바꿈
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // for 문 이용해 1 ~ 9 까지의 수를 입력받은 정수와의 곱을 구함
        for (int i = 1; i <= 9; i++) { 
            System.out.printf("%d * %d = %d\n", a, i, a * i);
        }
        sc.close();
    }
}
import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
        
	int a; // for문의 반복할 변수 선언
	int sum = 0; // 합계 값 변수 선언
        
        Scanner sc = new Scanner(System.in); // 값 입력
        a = sc.nextInt();
     
	for (int i = 1; i <= a; i++) { // i 부터 a 까지의 합
		sum += i;
	}
        System.out.println(sum); // 합계 값 결과 출력
        
        sc.close();
	}
}

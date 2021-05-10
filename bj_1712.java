import java.util.Scanner;

public class bj_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 고정비
		int b = sc.nextInt(); // 가변비
		int c = sc.nextInt(); // 상품 가격
		long count;
		if (b == 0 || c == 0 || b>=c) {
			count = -1;
		}
		else {
		count = a/(c-b) +1; //판매개수
		}
		System.out.println(count);
	}
}

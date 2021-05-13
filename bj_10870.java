import java.util.Scanner;

public class bj_10870 {
	static long f(int a) {
		if(a == 0) {
			return 0;
		}
		else if(a == 1) {
			return 1;
		}
		else {
			return f(a-1)+f(a-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(f(a));
	}

}

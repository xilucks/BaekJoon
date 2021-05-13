import java.util.Scanner;

public class bj_10872 {
	
	static long fact(int a) {
		if(a == 0 || a ==1) {
			return 1;
		}
		else {
		long sum = fact(a-1)*a;
		return sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fact(a));
	}

}

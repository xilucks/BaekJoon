import java.util.Scanner;

public class bj_2581 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int sum =0;
		int min =10001;
		do {
		a = sc.nextInt(); //a이상
		b = sc.nextInt(); //b이하
		}while(a<=0&&b<=0 );
		for(int i = a; i <=b; i++) {
		
			int count = 0;
			for(int j =1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
				else {
					continue;
				}
			}
			if(count == 2) {
				sum += i;
				if(min >i ) {
					min = i;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
		System.out.println(sum);
		System.out.println(min);
	
		}
	}
}

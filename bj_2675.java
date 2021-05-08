import java.util.Scanner;

public class bj_2675 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int c = 0 ; c < num; c ++) {
			int R = sc.nextInt();
			String S = sc.next();
		char[] Array = new char[S.length()];
		for(int i = 0; i < S.length(); i ++) {
			Array[i] = S.charAt(i);
		}
		for(int i = 0; i < S.length(); i ++) {
			for(int j = 0; j < R ; j++) {
				System.out.print(Array[i]);
			}
		}
		System.out.println("");
	}
	}

}

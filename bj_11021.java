import java.util.Scanner;

public class bj_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int a,b;
		n = sc.nextInt();
		
		for(int i = 1; i<= n ; i ++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}

	}

}

import java.util.Scanner;

public class bj_1978 {
	static boolean sosu(int a) {
		int count = 0;
		if( a == 0 ||a == 1) {
			return false;
		
		}
		else {
			for(int i = 1; i<=a; i++) {
				if((a%i) == 0){
					count++;
				}
				else {
					continue;
				}
				
			}
			if(count == 2) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0;
		for(int i = 0; i<num; i++) {
			int x = sc.nextInt();
			if (sosu(x) == true) {
				n++;
			}
		}
		System.out.println(n);
	}

}

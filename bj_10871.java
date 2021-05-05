import java.util.*;
public class bj_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = sc.nextInt();
		for(int i = 0; i <num; i++) {
			int n = sc.nextInt();
			if(n < max) {
				System.out.print(n+ " ");
			}
		}
		
	}

}

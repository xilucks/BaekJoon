import java.util.ArrayList;
import java.util.Scanner;

public class bj_1453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int count =0;
		for(int i = 0; i<n; i++) {
			int sit = sc.nextInt();
			if(! list.contains(sit)) list.add(sit);
			else count++;
		}
		System.out.println(count);
	}

}

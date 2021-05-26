import java.util.ArrayList;
import java.util.Scanner;

//2960번 : 에라토스테네스의 체

public class bj_2960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =2; i<= 2*n ; i++) {
			list.add(i);
		}
		int result = 0;
		int recount= 0;
		while(true) {
			int min = list.get(0);
			int count = 1;
			while(count * min <=n) {
				if(list.contains(count*min)) {
				list.remove(list.indexOf(count*min));
				result = count*min;
				recount ++;
				}
				count++;
				if(recount == m) break;
			}
			if(recount == m) break;
		}
		System.out.println(result);
	}

}

//사분면 고르기
import java.util.*;
public class bj_14681 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>0 && y>0) {
			System.out.println('1');
		}
		if(x<0 && y>0) {
			System.out.println('2');
		}
		if(x<0 && y<0) {
			System.out.println('3');
		}
		if(x>0 && y<0) {
			System.out.println('4');
		}

	}

}

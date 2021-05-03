import java.util.*;
public class bj_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h =sc.nextInt();
		int m = sc.nextInt();
		int total = h*60 + m;
		int alarm = total-45;
		if(alarm <= 0) {
			alarm = 60*24+m -45;
		}
		h = alarm/60;
		if(h == 24) {
			h = 0;
		}
		m = alarm%60;
		System.out.print(h+" "+m);
		

	}

}

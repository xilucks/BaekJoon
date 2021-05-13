import java.util.Scanner;

public class bj_2775 {
	static int floor(int floor, int ho) {
		if(ho == 1) {
			return 1;
		}
		else if(floor == 0) {
			return ho;
		}
		else {
			return floor(floor,ho-1)+floor(floor-1,ho);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i< t; i++) {
			int sta = sc.nextInt();
			int num = sc.nextInt();
			System.out.println(floor(sta,num));
		}
	}

}

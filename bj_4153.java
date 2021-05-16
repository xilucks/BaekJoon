import java.util.Scanner;

public class bj_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x,y,z;
		x  = sc.nextLong();
		y = sc.nextLong();
		z = sc.nextLong();
		while(x != 0 && y !=0 && z != 0) {
			String result;
			if((x*x)+(y*y) == (z*z) ||(x*x)+(z*z) == (y*y)||(z*z)+(y*y) == (x*x)  ) {
				result = "right";
			}
			else {
				result = "wrong";
			}
			System.out.println(result);
			x  = sc.nextLong();
			y = sc.nextLong();
			z = sc.nextLong();
		}
		

	}

}

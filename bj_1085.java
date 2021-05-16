import java.util.Scanner;

public class bj_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int shortx;
		int shorty;
		if(x > w-x) {
			shortx = w-x;
		}
		else {
			shortx = x;
		}
		if(y > h - y) {
			shorty = h-y;
		}
		else {
			shorty = y;
		}
		if(shortx > shorty) {
			System.out.println(shorty);
		}
		else {
			System.out.println(shortx);
		}
	}

}

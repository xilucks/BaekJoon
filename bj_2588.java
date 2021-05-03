import java.util.Scanner;

public class bj_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); //(1)
		long b = sc.nextLong(); //(2)
		
		long three,four,five,six;
		three = a*(b%10);
		four = a*(((b%100)/10));
		five = a*(b/100);
		six = a*b;//(6)
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);

	}

}

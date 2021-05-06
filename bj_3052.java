import java.util.Scanner;
public class bj_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[10];
		int count = 0;
		for(int i = 0; i <Array.length; i ++) {
			int a = sc.nextInt();
			Array[i] = a%42;
		}
		for(int i =0; i < 42; i ++) {
			for(int j =0; j<Array.length; j++) {
				if(Array[j] == i) {
					count ++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}

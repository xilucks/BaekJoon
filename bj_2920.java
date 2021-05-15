import java.util.Scanner;

public class bj_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[100];
		String result = null;
		for(int i = 1; i<=8; i++) {
			Array[i] = sc.nextInt();
		}
		if(Array[1] == 1) {
		for(int i = 1; i<=8; i++) {
			if(Array[i] != i) {
				result = "mixed";
				break;
			}
			result = "ascending";
		}
		}
		else {
		for(int i = 1; i<=8; i++) {
			if(Array[i] != 9-i) {
				result = "mixed";
				break;
			}
			result = "descending";
		}
		}
		System.out.println(result);
	}

}

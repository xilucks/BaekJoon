import java.util.Scanner;
public class bj_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int address = -1;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int [] Array = new int[9];
		for(int i = 0 ; i <Array.length; i ++) {
			Array[i] = sc.nextInt();
			if(Array[i]> max) {
				max = Array[i];
				address = i+1;
			}
		}
		System.out.println(max);
		System.out.println(address);

	}

}

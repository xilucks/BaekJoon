import java.util.Scanner;

public class bj_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[] high = new int[people];
		int[] weight = new int[people];
		for(int i = 0; i< people ; i++) {
			high[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		for(int i = 0; i<people;i++) {
			int count = 0;
			for(int j =0; j<people;j++) {
				if(high[i]<high[j]&&weight[i]<weight[j]) {
					count++;
				}
			}
			System.out.println(count+1);
			
		}
	}

}

import java.util.Scanner;

public class bj_2603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = (a>=b)? a:b;
		int min = (a>=b)? b:a;
		int least = 0; //�ּҰ����
		int greatest = 0; //�ִ�����
		for(int i = min; i>=1; i --) {
			if(a%i == 0 && b%i == 0) {
				greatest = i;
				break;
			}
		}
		for(int i = 1; i<=max; i++ ) {
			if((max*i)%min == 0) {
				least = max*i;
				break;
			}
		}
		System.out.println(greatest);
		System.out.println(least);
	}

}

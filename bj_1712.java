import java.util.Scanner;

public class bj_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // ������
		int b = sc.nextInt(); // ������
		int c = sc.nextInt(); // ��ǰ ����
		long count;
		if (b == 0 || c == 0 || b>=c) {
			count = -1;
		}
		else {
		count = a/(c-b) +1; //�ǸŰ���
		}
		System.out.println(count);
	}
}

import java.util.ArrayList;
import java.util.Scanner;

//2960�� : �����佺�׳׽��� ü

public class bj_2960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =2; i<= 2*n ; i++) {
			list.add(i);
		}
		int result = 0;
		int recount= 0;
		while(true) {
			int min = list.get(0);//�ּҰ�. ���⼭�� 2�̸� 2�ǹ���� ����µ� ���ȴ�.
			int count = 1;//min * count���� count�� ���� �÷��� min�� ����� ǥ��
			while(count * min <=n) {
				if(list.contains(count*min)) {//������� 2�� 3�� ����� 6�� ��� 2�� ������� ������ ���� �ְ� �������� �浹�� �Ͼ�Ƿ� list�� �ִ��� �������� �Ǵ��Ѵ�.
				list.remove(list.indexOf(count*min));//����Ʈ���� �����.
				result = count*min;// �����, n��°�� ������ ���� �������� �Ǵ��Ѵ�.
				recount ++;//��� k���� ���߱� ���� ��� ī��Ʈ�� ����Ѵ�.
				}
				count++;//�� ī��Ʈ�� ����� ��Ÿ����.
				if(recount == m) break;//��� ī��Ʈ�� �Է��� m���� ������ �����.
			}
			if(recount == m) break;//���� while���� �����ش�.
		}
		System.out.println(result);//��������
	}

}

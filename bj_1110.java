import java.util.Scanner;
public class bj_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();//�ʱⰪ
		int last = first;//�ʱ� 1ȸ �ݺ��� ���� ����ȭ
		int count = 0;//ī��Ʈ
		
		do{ 	//���ǹ��� first != last������ �ѹ��� ����
			int ten = last/10;
			int one = last%10;
			last  = (ten+one)%10 + one*10;
			count ++;
		}while(first != last); 
		System.out.println(count);

	}

}

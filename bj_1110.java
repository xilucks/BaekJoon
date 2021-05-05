import java.util.Scanner;
public class bj_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();//초기값
		int last = first;//초기 1회 반복을 위한 동일화
		int count = 0;//카운트
		
		do{ 	//조건문이 first != last임으로 한번은 실행
			int ten = last/10;
			int one = last%10;
			last  = (ten+one)%10 + one*10;
			count ++;
		}while(first != last); 
		System.out.println(count);

	}

}

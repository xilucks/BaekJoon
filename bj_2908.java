import java.util.Scanner;

public class bj_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a ,b;
		a= sc.nextInt();
		b= sc.nextInt();
		
		int a2,b2;
		int ah,at,ao;
		int bh,bt,bo;
		
		ah = a/100;
		bh = b/100;
		at = a%100/10;
		bt = b%100/10;
		ao = a%10;
		bo = b%10;
		
		a2 = ao*100 + at*10 + ah;
		b2 = bo*100 + bt*10 + bh;
		
		if(a2 > b2) {
			System.out.println(a2);
		}
		if(b2>a2){
			System.out.println(b2);
		}
		

	}

}

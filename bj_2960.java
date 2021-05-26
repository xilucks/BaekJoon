import java.util.ArrayList;
import java.util.Scanner;

//2960번 : 에라토스테네스의 체

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
			int min = list.get(0);//최소값. 여기서는 2이며 2의배수를 지우는데 사용된다.
			int count = 1;//min * count에서 count를 점차 늘려가 min의 배수를 표현
			while(count * min <=n) {
				if(list.contains(count*min)) {//예를들어 2와 3의 공배수 6의 경우 2의 배수에서 지워질 수도 있고 지워지면 충돌이 일어나므로 list에 있는지 없는지를 판단한다.
				list.remove(list.indexOf(count*min));//리스트에서 지운다.
				result = count*min;// 결과값, n번째에 지워진 수가 몇인지를 판단한다.
				recount ++;//결과 k에서 멈추기 위해 결과 카운트를 사용한다.
				}
				count++;//이 카운트는 배수를 나타낸다.
				if(recount == m) break;//결과 카운트가 입력한 m값과 같으면 멈춘다.
			}
			if(recount == m) break;//밖의 while문도 멈춰준다.
		}
		System.out.println(result);//결과값출력
	}

}

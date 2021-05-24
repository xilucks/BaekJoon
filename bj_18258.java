import java.util.Scanner;

public class bj_18258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] queue = new int[2000000];
		int num = sc.nextInt();
		int Front = 0;
		int Rear = 0;
		for(int i = 0; i<num ; i++) {
		String str = sc.next();
		switch(str) {
		case "push" :
			int a = sc.nextInt();
			queue[Rear] = a;
			Rear ++;
			break;
		case "pop" :
			if(Rear == Front) sb.append(-1+"\n");
			else {sb.append(queue[Front]+"\n");
			Front++;
			}
			break;
		case "size" :
			int size = Rear - Front;
			sb.append(size+"\n");
			break;
		case "empty" :
			if(Rear == Front) {
				sb.append("1"+"\n");
			}
			else sb.append("0"+"\n");
			break;
		case "front" :
			if(Rear == Front) sb.append(-1+"\n");
			else sb.append(queue[Front]+"\n");
			break;
		case "back" :
			if(Rear == Front) sb.append(-1+"\n");
			else sb.append(queue[Rear-1]+"\n");
			break;
		}
		}
		System.out.println(sb);
	}

}

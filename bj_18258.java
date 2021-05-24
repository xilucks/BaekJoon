import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_18258 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] queue = new int[2000000];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int Front = 0;
		int Rear = 0;
		for(int i = 0; i<num ; i++) {
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		switch(str) {
		case "push" :
			int a = Integer.parseInt(st.nextToken());
			queue[Rear] = a;
			Rear ++;
			break;
		case "pop" :
			if(Rear == Front) bw.write(-1+"\n");
			else {bw.write(queue[Front]+"\n");
			Front++;
			}
			break;
		case "size" :
			int size = Rear - Front;
			bw.write(size+"\n");
			break;
		case "empty" :
			if(Rear == Front) {
				bw.write("1"+"\n");
			}
			else bw.write("0"+"\n");
			break;
		case "front" :
			if(Rear == Front) bw.write(-1+"\n");
			else bw.write(queue[Front]+"\n");
			break;
		case "back" :
			if(Rear == Front) bw.write(-1+"\n");
			else bw.write(queue[Rear-1]+"\n");
			break;
		}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

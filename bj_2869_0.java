import java.io.*;
import java.util.*;
public class bj_2869_0 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int result = (v-a)/(a-b);
		if((v-a)%(a-b) != 0) {
			result++;
		}
		System.out.println(result+1);
	}

}

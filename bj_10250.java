import java.util.*;
import java.io.*;
public class bj_10250 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		int h,w,n;

		for(int i = 0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int h2 = 0;
			int w2 = 1;
			for(int j = 0; j<n; j ++) {
				if(h2 == h) {
					h2 = 0;
					w2++;
				}
				h2++;
			}
			System.out.println(h2*100+w2);
		
		}
		
	}

}

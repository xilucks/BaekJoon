import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Stack;
import java.util.StringTokenizer;
public class bj_9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i =0; i<n; i++) {
			String result = null;
			st = new StringTokenizer(br.readLine());
			String sten = st.nextToken();
			Stack<Character> stack = new Stack<Character>();
			for(int j =0; j <sten.length(); j++) {
				char ch = sten.charAt(j);
				switch(ch) {
				case '(' :
					stack.push(ch);
					break;
				case ')' :
					if(stack.empty() ==true) stack.push(ch);
					else if(stack.peek() == '('){ stack.pop();}
					else {stack.push(ch);}
					break;
				}
				if(stack.empty() == true) {
					result = "YES";
				}
				else {
					result = "NO";
				}
				
			}
			bw.write(result+"\n");	
		}
		bw.flush();
	}

}

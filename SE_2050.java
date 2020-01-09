import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SE_2050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		
		String line = br.readLine();
//		String line = sc.next();
		
		//알파벳을 숫자로 변환
		for(int i = 0; i<line.length(); i++){
			System.out.print(line.charAt(i)-'A' + 1 +" ");
		}
	}
}

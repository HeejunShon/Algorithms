import java.util.Arrays;
import java.util.Scanner;

public class SE_2063{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int[] arr = new int[T];
		
		int answer = 0;
		for(int tc = 1; tc<= T; tc++){
			arr[tc - 1] = sc.nextInt();
		}
		Arrays.sort(arr);
		//중간값 찾기
		System.out.println(arr[(T-1)/2]);
	}

}

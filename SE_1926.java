import java.util.Scanner;

public class SE_1926 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		String answer = "";
		boolean isClap = false;
		int num = 0;
		
		//간단한 369게임
		while(++num <= T){
			//숫자 한 자리씩 검사
			int inNum = num;
			while(inNum > 0){
				if(inNum % 10 == 3 || inNum % 10 == 6|| inNum % 10 == 9){
					answer += "-";
					isClap = true;
				}
				inNum = inNum / 10;
			}
			//369 아닐 시 해당 수 출력
			if(!isClap){
				answer += num;
			}
			//마지막 수 제외하고 공백 출력
			if(num != T){
				answer += " ";
			}
			isClap = false;
		}
		//정답
		System.out.println(answer);
	}

}

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
		
		//������ 369����
		while(++num <= T){
			//���� �� �ڸ��� �˻�
			int inNum = num;
			while(inNum > 0){
				if(inNum % 10 == 3 || inNum % 10 == 6|| inNum % 10 == 9){
					answer += "-";
					isClap = true;
				}
				inNum = inNum / 10;
			}
			//369 �ƴ� �� �ش� �� ���
			if(!isClap){
				answer += num;
			}
			//������ �� �����ϰ� ���� ���
			if(num != T){
				answer += " ";
			}
			isClap = false;
		}
		//����
		System.out.println(answer);
	}

}

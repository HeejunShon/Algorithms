import java.util.Scanner;
import java.util.Stack;

public class SE_8931 {
	//Á¦·Î
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int tc=1; tc<=T; tc++){
			int numCase = sc.nextInt();
			Stack deposit = new Stack();
			
			for(int i=0; i<numCase; i++){
				int money = sc.nextInt();
				if(money != 0){
					deposit.push(money);
				}
				else{
					deposit.pop();
				}
			}
			int sum = 0;
			while(!deposit.empty()){
				sum += (int)deposit.pop();
			}
			System.out.println("#" + tc + " " + sum);
		}

	}

}

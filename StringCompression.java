
public class StringCompression {
    public static int solution(String s) {
        int start = 0;
        int end = s.length()/2;
        String c = s.substring(start, end);
        
        //���� �ݺ� ���� ã��
        while(!c.equals(s.substring(end, end + end - start))){
        	c = s.substring(start, --end);
        }
        
        //�ݺ� ������ s���� ����
        if(end == 0)
        	return s.length();
        
        //�ݺ� ���̸�ŭ ����
        int len = c.length(); //�ݺ� ���� ����
        String answer = "";
        int recur = 0;
        
        while(start < s.length()){
        	if(end > s.length()){
        		c += s.substring(start);
        		break;
        	}
//        	System.out.println("c: " + c+",s: "+s.substring(start, end));
        	if(s.substring(start, end).equals(c)){
        		start += len;
        		end += len;
        		recur++;
        	}
        	else{
        		if(recur == 0||recur == 1)
        			answer += c;
        		else
        			answer += recur + c;
        		recur = 0;
        		c = s.substring(start, end);
        	}
        }
        
        if(recur == 0 || recur == 1)
        	answer += c;
        else
        	answer += recur + c;
//        System.out.println(answer);
        return answer.length();
    }
    //2020 īī�� ����ε� ��ä
    //���ڿ��� �պ��� ������ ���̷� �߶�� ��
    //1.s������ ������ �ڸ� �迭 c
    //2.s�� ����+1�� c�� ù��° ���� ++�� �������� �˻�
    //2-1. �迭 ������ �����ϸ� ���� �˻�
    //2-1-1. �ݺ��Ǵ� ��ŭ ���� + c
    //2-1-2. s���� c�� ġȯ, 
    //2-2. �������� ������ s������ �� -1���� �ڸ� �迭 c
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("xababcdcdababcdcd");
		//34��
	}

}

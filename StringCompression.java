
public class StringCompression {
    public static int solution(String s) {
        int start = 0;
        int end = s.length()/2;
        String c = s.substring(start, end);
        
        //동일 반복 길이 찾기
        while(!c.equals(s.substring(end, end + end - start))){
        	c = s.substring(start, --end);
        }
        
        //반복 없으면 s길이 리턴
        if(end == 0)
        	return s.length();
        
        //반복 길이만큼 압축
        int len = c.length(); //반복 길이 단위
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
    //2020 카카오 블라인드 공채
    //문자열을 앞부터 정해진 길이로 잘라야 함
    //1.s길이의 반으로 자른 배열 c
    //2.s의 절반+1이 c의 첫번째 원소 ++와 동일한지 검사
    //2-1. 배열 끝까지 동일하면 길이 검사
    //2-1-1. 반복되는 만큼 숫자 + c
    //2-1-2. s원소 c로 치환, 
    //2-2. 동일하지 않으면 s길이의 반 -1으로 자른 배열 c
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("xababcdcdababcdcd");
		//34점
	}

}

package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/myFolder/myMemo.txt");
		//FileReader 객체 생성
		FileReader fr = null;
		//BufferedReader 객체생성
		BufferedReader br = null;
		try {
		
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			//반복문을 돌면서 한줄씩 읽어들인다.
			while(true) {
				String line = br.readLine();
				//더이상 읽을 line이 없으면 null이 리턴된다.
				if(line==null) {
					break;//반복문 탈출
				}
				//읽은 내용 콘솔에 출력해보기
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ie) {
			//br.readLine의 exception
			ie.printStackTrace();
		} finally {
			//마무리 작업
			//fr, br을 try/catch 블록 밖에서 선언하였으므로 참조값으로 사용할 수 있으며, 에러가 나든 안나든 close할 수 있다.
			try {
				//nullpointerException 막기 위해 null이 아닌 경우에 메소드를 호출하는 구조
				if(br!=null)br.close();
				if(fr!=null)fr.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
	}

}

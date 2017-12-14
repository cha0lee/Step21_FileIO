package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		String path = "c:/myFolder/myMemo.txt";
		
		//경로 정보를 가지고 있는 문자열을 생성자의 인자로 전달하면서 File객체 생성하기
		File file = new File(path);
		
		if(file.exists()) {//존재하면
			if(file.isDirectory()) {
				System.out.println(path + " 는 디렉토리 입니다.");
			}else {
				System.out.println(path + "는 파일입니다.");
			}
			
		}else {//존재하지 않으면
			System.out.println(path + " 는 존재하지 않아요.");
			//파일 만들기
			file.createNewFile();
			System.out.println(path + " 파일 생성함");
			
		}
	}
}

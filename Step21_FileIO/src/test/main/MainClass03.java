package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		String path = "c:/ncs09";
		
		//경로 정보를 가지고 있는 문자열을 생성자의 인자로 전달하면서 File객체 생성하기
		File file = new File(path);
		
		String[] fileList = file.list();
		
		for(String tmp:fileList) {
			System.out.println(tmp);
		}
		
		System.out.println("-------");
		//디렉토리 혹은 파일을 access할 수 있는 File 객체가 담긴 File[] 객체 얻어오기
		File[] files = file.listFiles();
		for(File tmp:files) {
			String name = tmp.getName();
			if(tmp.isDirectory()) {
				System.out.println("[D]" + name);
			}else {
				System.out.println(name);
			}
		}
	}
}

﻿package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
			FileInputStream fis=null;
			FileOutputStream fos=null;
		
			try {
				//필요한 객체를 생성해서 변수에 참조값 대입하기 
				fis=new FileInputStream("c:/myFolder/myImage.jpg");
				fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
				
				//한번에 읽어올 byte 의 크기를 고려해서 byte[] 객체 생성하기
				byte[] buffer=new byte[1000];
				while(true){
					//buffer 객체를 이용해서 byte 알갱이를 읽어들인다. 
					int readedCount=fis.read(buffer);
					//더이상 읽을 byte 알갱이가 없다면 반복문 탈출 
					if(readedCount == -1)break;
					//buffer 객체에 저장된 byte 알갱이를 읽은 만큼 대상 파일에 출력한다.
					//0번 방에서 readedCount(읽은 만큼)
					fos.write(buffer, 0, readedCount);
					
					fos.flush();//방출
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				//실행이 반듯이 보장되는 블럭에서 마무리 작업을 할게 있으면 한다. 
				try {
					fos.close();
					fis.close();//닫아주기 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	}

}

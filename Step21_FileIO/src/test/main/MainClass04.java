﻿package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args){
		String path = "c:/myFolder/myMemo.txt";
		File file = new File(path);
		
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write("하나\r\n");
			fw.write("두울\r\n");
			fw.write("어쩌구\r\n");
			fw.write("저쩌구\r\n");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt에 문자열 출력함.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

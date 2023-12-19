package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("example03.txt");
			if(!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
;			
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

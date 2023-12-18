package com.java.io;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan gugu = new gugudan();
		try {
			File file = new File("example03.txt");
			if (!file.exists())
				file.createNewFile();

			FileWriter myWirter = new FileWriter(file);

			myWirter.write("Hello!!\n");
			myWirter.write("Java Programming\n\n");
			myWirter.write(gugu.main());
			myWirter.close();

			System.out.println("\n파일 쓰기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

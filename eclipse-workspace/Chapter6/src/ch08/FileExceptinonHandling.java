package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptinonHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");
			System.out.println("Read");
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Finally");
		}
		System.out.println("End");
	}
}

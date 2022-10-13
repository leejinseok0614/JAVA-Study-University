package ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buff[] = { 'B', 'C', 'D', 'E', 'F', 'G' };

			fw.write(buff);
			fw.write("안녕하세요.");
			fw.write(buff, 1, 2);
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}

package ch11;

public class MyLoggerTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();

		myLogger.log("test");
	}
}
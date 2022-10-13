package ch08;

public class AutoCloseableObj implements AutoCloseable {

	public void close() throws Exception {
		System.out.println("Close...");
	}
}

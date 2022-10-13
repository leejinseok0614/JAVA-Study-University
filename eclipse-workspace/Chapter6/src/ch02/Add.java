package ch02;

@FunctionalInterface // 메소드를 2개 이상 선언할수 없음.
public interface Add {

	public int add(int x, int y);
}

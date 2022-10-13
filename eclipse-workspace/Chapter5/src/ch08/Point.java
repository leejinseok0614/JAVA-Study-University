package ch08;

public class Point<T, V> {
// 2개의 점이 어떤 타입이든 replace가 가능하다.

	T x;
	V y;

	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}
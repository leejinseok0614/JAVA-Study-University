package ch06;

public class ThreeDPrinter3 {

	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	public String toString() {
		return "재료는 " + material + " 입니다.";
	}
}

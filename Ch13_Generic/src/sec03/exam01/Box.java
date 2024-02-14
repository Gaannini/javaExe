package sec03.exam01;

//T는 입력되는 DataType을 가리키는 대명사
public class Box<T> {
	// 필드
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}

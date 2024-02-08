package _01object.sec03.exam01;

//java의 모든 클래스의 회상위 부모는 Object클래스가 된다.
public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if (id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}

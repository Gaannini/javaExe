package _02lambda.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String::compareToIgnoreCase);// (a, b) -> a.compareToIgnoreCase(b)
	}
}
package _01string;

public class StringCompare {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1 = "Hello, Java";
		String str2 = new String("Hello, Java");

		// 같은 공간의 객체인가 비교
		// str0과 str1은 같은 객체를 가리키고, str2는 다른 객체이다
		if (str0 == str1)
			System.out.println("str0과 str1은 같습니다.");
		else
			System.out.println("str0과 str1은 다릅니다.");

		if (str0 == str2)
			System.out.println("str0과 str2은 같습니다.");
		else
			System.out.println("str0과 str2은 다릅니다.");

		// Java의 String은 그래서 문자열내용을 비교할때 ==을 사용하지 않고 equals를 사용한다.

		if (str0.equals(str1))
			System.out.println("str0과 str1은 같습니다.");
		else
			System.out.println("str0과 str1은 다릅니다.");

		if (str0.equals(str2))
			System.out.println("str0과 str2은 같습니다.");
		else
			System.out.println("str0과 str2은 다릅니다.");
	}
}

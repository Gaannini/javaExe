package _01stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("톨스토이");
		nameList.add("김수한무거북이와두루미");
		nameList.add("Cristoper");

		for (String name : nameList) {
			if (name.length() >= 5) {
				System.out.print(name + ", ");
			}
		}
		System.out.println();

		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s -> s.length() >= 5);
		strmF.forEach(s -> System.out.print(s + ","));
		System.out.println();

		nameList.stream() // 1) 스트림 객체
				.filter(s -> s.length() >= 5) // 중간연산 (참일 때 새로운 스트림)
				.forEach(s -> System.out.print(s + ", ")); // 최종연산
	}
}

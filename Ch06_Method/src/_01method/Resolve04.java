//gugudan(3);   
//구구단 메서드를 void 리턴형으로 제작하세요.
package _01method;

import java.util.Scanner;

public class Resolve04 {
	public static void gugudan(int n) {
		for (int i = 1; i < 10; i++)
			System.out.println(n + "X" + i + "=" + (n * i));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 : ");
		int num = sc.nextInt();
		gugudan(num);
	}
}

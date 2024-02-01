package _07resolve4;

public class ArrayUtility2 {

	// s1과 s2를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		int[] newarr = new int[s1.length + s2.length];
		for (int i = 0; i < newarr.length; i++) {
			if (i < s1.length)
				newarr[i] = s1[i];
			else
				newarr[i] = s2[i - s1.length];
		}
		return newarr;

	};

	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	static int[] remove(int[] s1, int[] s2) {
		int[] newarr = new int[s1.length];
		int num = 0;
		boolean exist = false;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					exist = true;
					break;
				} else {
					continue;
				}

			}
		}
		return newarr;
	};

}

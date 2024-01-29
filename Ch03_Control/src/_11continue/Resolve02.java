//for문을 이용해서 아래 출력
//*
//**
//***
//****
//*****

package _11continue;

public class Resolve02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}

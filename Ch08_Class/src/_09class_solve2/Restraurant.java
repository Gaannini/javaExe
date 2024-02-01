package _09class_solve2;

import java.util.Scanner;

public class Restraurant {
	// 필드
	public Scanner sc;
	private String[] foods = { "짜장면", "짬뽕", "탕수육", "우동" };
	private int actionNum;// 행동
	private int menuNum;// 메뉴선택

	// 메서드
	public void action() {
		System.out.println("------중식당입니다.------");
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 주문하기");
		System.out.println("2. 나가기");
		System.out.print(" >> ");
		actionNum = sc.nextInt();
		if (actionNum == 1)
			Order_F();
		else if (actionNum == 2)
			Exit();
		else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	// 메뉴주문
	public void Order_F() {
		System.out.println("------중식당입니다.------");
		System.out.println("메뉴를 골라주세요");
		for (int i = 1; i <= foods.length; i++)
			System.out.println(i + ". " + foods[i - 1]);

		// 주문받기
		System.out.print(" >> ");
		menuNum = sc.nextInt();
		if (menuNum <= foods.length)
			Order(menuNum);
		else
			System.out.println("해당 메뉴는 없습니다.");
		System.out.println();
	}

	// 주문한 음식이 나옴
	public void Order(int menuNum) {
		System.out.println("------중식당입니다.------");
		System.out.println(foods[menuNum - 1] + "나왔습니다.");
		System.out.println();
	}

	// 나가기
	public void Exit() {
		System.out.println("안녕히가세요");
	}
	/*
	 * public void AddMenu_F() { System.out.println("------중식당입니다.------");
	 * System.out.println("무슨 메뉴를 추가하시겠습니까?"); //추가할 메뉴 입력 String newMenu =
	 * sc.next(); AddMenu(newMenu); System.out.println(); }
	 * 
	 * public void AddMenu(String newMenu) { String Refoods[] = Arrays.copyOf(foods,
	 * foods.length+1); System.out.println("------중식당입니다.------");
	 * System.out.println(newMenu+"무엇을 하시겠습니까?"); System.out.println(); }
	 */
}

package _09class_solve2;

import java.util.Scanner;

public class RestraurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Restraurant rest = new Restraurant();
		rest.sc = sc;
		rest.action();
	}
}

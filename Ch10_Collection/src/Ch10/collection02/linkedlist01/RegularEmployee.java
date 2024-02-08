package Ch10.collection02.linkedlist01;

//정규직 사원
public class RegularEmployee extends Employee {

	protected int yearSalary; // 연봉
	protected int bonus; // 보너스

	public RegularEmployee(String empno, String name, int yearSalary, int bonus) {
		super(empno, name); // Employee(empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mpay = (double) (yearSalary + bonus) / 12;
		return mpay;
	}

	@Override
	public void showEmployeeInfo() {
		// 부모의 기능 + 확장
		super.showEmployeeInfo();
		System.out.println("bonus: " + bonus);
		System.out.printf("monthPay: %.2f \n\n", getMonthPay());
	}

}

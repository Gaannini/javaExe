package Ch10.collection02.linkedlist03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	// private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	// private Employee[] empArr = new Employee[EMP_NUM];
	// private int numOfEmp = 0; // 저장된 사원객체 수, 다음 사원이 저장될 index

	private List<Employee> empList = new LinkedList<Employee>();
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사원 검색");
		System.out.println("9. 사원 수정");
		System.out.println("10. 사원 삭제");
		System.out.println("11. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		System.out.println();
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);

		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);

		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);

		return emp;
	}

	private void saveEmployee(Employee emp) {
		this.empList.add(emp);
	}

	private void viewAllEmployee() {
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			E.showEmployeeInfo();
		}
		System.out.println("--------------------");
	}

	private void viewRegularEmployee() {
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E instanceof RegularEmployee) {
				E.showEmployeeInfo();
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	private void viewTempEmployee() {
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E instanceof TempEmployee) {
				E.showEmployeeInfo();
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	private void viewPartTimeEmployee() {
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E instanceof PartTimeEmployee) {
				E.showEmployeeInfo();
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	private void SearchEmployee() {
		System.out.print("검색할 사원의 사번 >> ");
		String searchempno = sc.next();
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E.empno.equals(searchempno)) {
				E.showEmployeeInfo();
				System.out.println("--------------------");
				break;
			} else if (i == this.empList.size() - 1 && !E.empno.equals(searchempno)) {
				System.out.println("--------------------");
				System.out.println("해당하는 사원이 없습니다.");
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	private void ModifyEmployee() {
		System.out.print("수정할 사원의 사번 >> ");
		String modifyempno = sc.next();
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E.empno.equals(modifyempno)) {
				if (E instanceof RegularEmployee) {
					System.out.print("이름 >> ");
					String name = sc.next();
					System.out.print("연봉 >> ");
					int yearSalary = sc.nextInt();
					System.out.print("보너스 >> ");
					int bonus = sc.nextInt();
					System.out.println();
					empList.set(i, new RegularEmployee(modifyempno, name, yearSalary, bonus));
				} else if (E instanceof TempEmployee) {
					System.out.print("이름 >> ");
					String name = sc.next();
					System.out.print("연봉 >> ");
					int yearSalary = sc.nextInt();
					System.out.print("계약기간 >> ");
					int hireYear = sc.nextInt();
					empList.set(i, new TempEmployee(modifyempno, name, yearSalary, hireYear));
				} else if (E instanceof PartTimeEmployee) {
					System.out.print("이름 >> ");
					String name = sc.next();
					System.out.print("일당 >> ");
					int dailyPay = sc.nextInt();
					System.out.print("일한 일수 >> ");
					int workDay = sc.nextInt();
					empList.set(i, new PartTimeEmployee(modifyempno, name, dailyPay, workDay));
				}
				System.out.println();
				break;
			} else if (i == this.empList.size() - 1 && !E.empno.equals(modifyempno)) {
				System.out.println("--------------------");
				System.out.println("해당하는 사원이 없습니다.");
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	private void DeleteEmployee() {
		System.out.print("삭제할 사원의 사번 >> ");
		String delempno = sc.next();
		for (int i = 0; i < this.empList.size(); i++) {
			Employee E = empList.get(i);
			if (E.empno.equals(delempno)) {
				empList.remove(i);
				System.out.println("--------------------");
				System.out.println(delempno + " 사원을 삭제하였습니다.");
				System.out.println("--------------------");
				break;
			} else if (i == this.empList.size() - 1 && !E.empno.equals(delempno)) {
				System.out.println("--------------------");
				System.out.println("해당하는 사원이 없습니다.");
				System.out.println("--------------------");
			} else
				continue;
		}
	}

	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			switch (selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployee();
				break;
			case EmpMenu.REG_EMP_INFO:
				emp = null;
				viewRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP_INFO:
				emp = null;
				viewTempEmployee();
				break;
			case EmpMenu.PART_EMP_INFO:
				emp = null;
				viewPartTimeEmployee();
				break;
			case EmpMenu.SEARCH_EMP:
				emp = null;
				SearchEmployee();
				break;
			case EmpMenu.MODIFY_EMP:
				emp = null;
				ModifyEmployee();
				break;
			case EmpMenu.DELETE_EMP:
				emp = null;
				DeleteEmployee();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			if (emp != null)
				saveEmployee(emp);
		}
		System.out.println("program exit...");
	}
}

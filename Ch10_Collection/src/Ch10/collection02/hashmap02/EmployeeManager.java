package Ch10.collection02.hashmap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
	// private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	// private Employee[] empArr = new Employee[EMP_NUM];
	// private int numOfEmp = 0; // 저장된 사원객체 수, 다음 사원이 저장될 index

	private Map<String, Employee> empmap = new HashMap<String, Employee>();
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
		System.out.println("8. 종료");
		System.out.print("번호 입력 >>");
		int sel = sc.nextInt();
		return sel;
	}

	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("연봉 >>");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >>");
		int bonus = sc.nextInt();
		System.out.println();
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);

		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("연봉 >>");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >>");
		int hireYear = sc.nextInt();
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);

		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("일당 >>");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >>");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);

		return emp;
	}

	private void saveEmployee(Employee emp) {
		this.empmap.put(emp.empno, emp);
	}

	private void viewAllEmployee() {
		Set<String> keySet = empmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee E = empmap.get(k);
			E.showEmployeeInfo();
		}
	}

	private void viewRegularEmployee() {
		Set<String> keySet = empmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee E = empmap.get(k);
			if (E instanceof RegularEmployee)
				E.showEmployeeInfo();
			else
				continue;
		}
	}

	private void viewTempEmployee() {
		Set<String> keySet = empmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee E = empmap.get(k);
			if (E instanceof TempEmployee)
				E.showEmployeeInfo();
			else
				continue;
		}
	}

	private void viewPartTimeEmployee() {
		Set<String> keySet = empmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee E = empmap.get(k);
			if (E instanceof PartTimeEmployee)
				E.showEmployeeInfo();
			else
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
package _13interface.order01;

import _13interface.Icar;

public class CarTester {
	private final int TEST_NUM = 3;
	private Icar car;

//	외부에서 주입
//	CarTest는 Icar에 의존적이다.
	public CarTester(Icar car) {
		this.car = car;
	}

	public CarTester() {

	}

	public void setCar(Icar car) {
		this.car = car;
	}

	public int onOffTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			car.turnOn();
			car.turnOff();
		}
		return (int) (Math.random() * 50) + 50; // 50~99
	}

	public int speedTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			car.accel();
			car.accel();
			car.accel();
		}
		return (int) (Math.random() * 50) + 50; // 50~99
	}

	public int breakTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			car.accel();
			car.accel();
			car.footBreak();
			car.footBreak();
			car.footBreak();
		}
		return (int) (Math.random() * 50) + 50; // 50~99
	}

	public int driveTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			car.turnOn();
			car.accel();
			car.accel();
			car.footBreak();
			car.footBreak();
			car.turnOff();
		}
		return (int) (Math.random() * 50) + 50; // 50~99
	}

}

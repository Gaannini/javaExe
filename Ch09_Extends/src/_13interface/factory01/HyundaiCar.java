package _13interface.factory01;

import _13interface.Icar;

public class HyundaiCar implements Icar {
	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("HyundaiCar : 시동이 부드럽게 잘 걸린다~");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("HyundaiCar : 시동이 부드럽게 잘 Off~");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("HyundaiCar : 엑셀이 터보로 동작된다~");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("HyundaiCar : 브레이크가 부드럽게 동작한다~");
		Thread.sleep((long) (Math.random() * 500) + 500);
	}
}

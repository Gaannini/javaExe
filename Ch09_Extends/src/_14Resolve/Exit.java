package _14Resolve;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "4.Exit\n\n";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
	}

	@Override
	public boolean isRun() {
		return false;
	}

}

package DesignPattern;

import java.io.IOException;

public class MainTest {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Exam exam = new Exam();
		exam.createExam();
		exam.displayExam();

	}


}

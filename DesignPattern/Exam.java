package DesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
	private Question[] question;
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	 
	public Exam() {
		
	}
	
	
	public void createExam() throws NumberFormatException, IOException {
		System.out.println("Enter the number of question ");
		int number = Integer.parseInt(bReader.readLine());
		question = new Question[number];
		for(int index = 0; index < number; index++) {
			question[index] = new Question();
			question[index].createQuestion();
		}
	}
	
	public void displayExam() {
		for(int i = 0 ; i < question.length;i++) {
			question[i].displayQuestion();
		}
	}
}

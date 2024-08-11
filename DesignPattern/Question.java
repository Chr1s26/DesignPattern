package DesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question {
	
	String answer;
	String question;
	String[] multipleChoice ;
	
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	
	public Question() {
		this.multipleChoice =  new String[4];
	
	}

	public void createQuestion() throws IOException {
		System.out.println("Enter the question : ");
		this.question = bReader.readLine();
		
		System.out.println("Enter 4 choices : ");
		for(int index = 0 ; index < 4; index++) {
			System.out.printf("Choice %d: ",index+1);
			this.multipleChoice[index] = bReader.readLine();
		}
		
		System.out.println("Enter the correct answer: ");
		  int answerIndex = Integer.parseInt(bReader.readLine()) - 1;
	      this.answer = this.multipleChoice[answerIndex];
	}
	
	public void displayQuestion() {
		System.out.println("Question : "+this.question);
		for (int index = 0 ; index < 4 ; index ++) {
			System.out.printf("  %d. %s\n", index + 1, this.multipleChoice[index]);
		}
		System.out.println("Correct Answer: " + this.answer);
	}
	
	

}

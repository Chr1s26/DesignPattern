package com.example.service;

import java.io.IOException;
import com.example.model.Question;

public class QuestionService extends BaseService{
	private Question question;
	
	public QuestionService() {
		
	}
	
	public void create() throws IOException {
		this.question = new Question();
		this.getQuestion();
		this.getOptions();
		this.getAnswer();
	}
	
	private void getAnswer() throws IOException {
		System.out.print("Enter Answer : ");
		String Answer = br.readLine();
		this.question.setAnswer(Answer);
	}
	
	private void getQuestion() throws IOException {
		System.out.print("Enter Question : ");
		String question = br.readLine();
		this.question.setQuestion(question);
	}
	
	private void getOptions() throws IOException {
		String flag = "";
		do {
			System.out.print("Enter Option : ");
			String option = br.readLine();
			this.question.addOption(option);
			
			System.out.print("Do You Want to add new Option yes/no : ");
			flag = br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
	}

	public Question getQuestionObj(){
		return this.question;
	}

}

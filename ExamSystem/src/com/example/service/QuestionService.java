package com.example.service;

import java.io.IOException;
import com.example.model.Question;

public abstract class QuestionService extends BaseService{
	private Question question;
	
	public QuestionService() {
		
	}
	
	public abstract void create() throws IOException;
	
	protected void getAnswer() throws IOException {
		System.out.print("Enter Answer : ");
		String Answer = br.readLine();
		this.question.setAnswer(Answer);
	}
	
	protected void getQuestion() throws IOException {
		System.out.print("Enter Question : ");
		String question = br.readLine();
		this.question.setQuestion(question);
	}
	
	protected void getQuestionType() throws IOException {
		System.out.print("Enter Question Type : ");
		String type = br.readLine();
		this.question.setType(type);
	}
	
	public Question getQuestionObj(){
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}

package com.example.model;

import java.util.Arrays;

public class Question {
	
	private String question;
	private String answer;
	private String type;
	private Exam exam;
	
	
	public Question() {
		
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "\n"+this.getQuestion()+"\nAnswer : "+ this.getAnswer()+"\n" ;
	}
	
	
}

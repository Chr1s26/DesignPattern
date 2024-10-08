package com.example.model;

public class Exam {
	private final static int maxQuestionCount = 60;
	private String title;
	private Question[] questions;
	private int questionCount = 0;
	
	public Exam() {
		this.questions = new Question[maxQuestionCount];
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addQuestion(Question question) {
		this.questions[questionCount] = question;
		this.questionCount++;
	}

	@Override
	public String toString() {
		String title = "\n***************"+this.title+"**************\n";
		
		for(int i=0; i< questionCount; i++) {
			Question question = this.questions[i];
			title += question;
		}
		
		return title;
	}
}

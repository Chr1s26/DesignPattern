package com.example.model;

public class Question {
	private final static int maxOptionsCount = 6;
	private String question;
	private String answer;
	private String[] options;
	private Exam exam;
	private int optionCount;
	
	public Question() {
		this.optionCount = 0;
		this.options = new String[maxOptionsCount];
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void addOption(String option) {
		this.options[optionCount] = option;
		this.optionCount++;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}

}

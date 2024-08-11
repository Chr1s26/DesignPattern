package com.example.model;

import java.util.Arrays;

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

	@Override
	public String toString() {
		String options =  "";
		for(int i=0; i<optionCount; i++) {
			options += "No("+(i+1)+") "+ this.options[i] +"\n";
		}
		return "\n "+this.question+ "\n "+ options + "Answer : "+ this.answer +"\n" ;
	}
	
}

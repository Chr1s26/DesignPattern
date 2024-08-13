package com.example.model;

public class MultipleChoice extends Question{
	private final static int maxOptionsCount = 6;
	private String[] options;
	private int optionCount;
	
	public MultipleChoice() {
		this.optionCount = 0;
		this.options = new String[maxOptionsCount];
	}
	
	public void addOption(String option) {
		this.options[optionCount] = option;
		this.optionCount++;
	}
	
	@Override
	public String toString() {
		String options =  "";
		for(int i=0; i<optionCount; i++) {
			options += "No("+(i+1)+") "+ this.options[i] +"\n";
		}
		return "\n "+this.getQuestion()+ "\n "+ options + "Answer : "+ this.getAnswer()+"\n" ;
	}
}

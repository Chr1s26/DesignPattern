package com.example.service;

import java.io.IOException;

import com.example.model.MultipleChoice;

public class MultipleChoiceService extends QuestionService{
	
	public MultipleChoiceService() {
		this.setQuestion(new MultipleChoice());
	}

	private void getOptions() throws IOException {
		String flag = "";
		do {
			System.out.print("Enter Option : ");
			String option = br.readLine();
			this.getQuestionObj().addOption(option);
			
			System.out.print("Do You Want to add new Option yes/no : ");
			flag = br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
	}
	
	public MultipleChoice getQuestionObj() {
		return (MultipleChoice)super.getQuestionObj();
	}

	@Override
	public void create() throws IOException {
		this.getQuestion();
		this.getOptions();
		this.getAnswer();	
	}
}

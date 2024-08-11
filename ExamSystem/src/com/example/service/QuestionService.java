package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Question;

public class QuestionService {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private Question question;
	
	public QuestionService() {
		this.question = new Question();
	}
	
	public Question create() throws IOException {
		this.getQuestion();
		this.getOptions();
		this.getAnswer();
		return this.question;
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

}

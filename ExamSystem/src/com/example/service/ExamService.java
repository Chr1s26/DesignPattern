package com.example.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Exam;
import com.example.model.Question;

public class ExamService {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private Exam exam;
	private QuestionService questionService;

	public ExamService() {
		this.exam = new Exam();
	}

	public Exam create() throws IOException {
		this.getExamTitle();
		this.getQuestions();
		return this.exam;
	}
	
	private void getQuestions() throws IOException {
		String flag = "";
		do {
			Question question = questionService.create();
			this.exam.addQuestion(question);
			System.out.print("Do You Want to add new Question yes/no : ");
			flag = br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
	}

	private void getExamTitle() throws IOException {
		System.out.print("Enter Exam Title : ");
		String title = br.readLine();
		this.exam.setTitle(title);
	}
}

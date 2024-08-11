package com.example.service;

import java.io.IOException;
import com.example.model.Exam;

public class ExamService extends BaseService {

	private Exam exam;
	private QuestionService questionService;

	public ExamService() {
		this.exam = new Exam();
		this.questionService = new QuestionService();
	}

	public void create() throws IOException {
		this.getExamTitle();
		this.getQuestions();
	}
	
	private void getQuestions() throws IOException {
		String flag = "";
		do {
			questionService.create();
			this.exam.addQuestion(questionService.getQuestionObj());
			System.out.print("Do You Want to add new Question yes/no : ");
			flag = br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
	}

	private void getExamTitle() throws IOException {
		System.out.print("Enter Exam Title : ");
		String title = br.readLine();
		this.exam.setTitle(title);
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
}

package com.main_app;

import java.io.IOException;
import com.example.service.ExamService;

public class MainApp {

	public static void main(String[] args) throws IOException {
		
		ExamService examService = new ExamService();
		examService.create();
		
		System.out.println(examService.getExam());

	}

}

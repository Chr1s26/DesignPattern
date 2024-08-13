package com.example.service;

import java.io.IOException;

import com.example.model.DefinationType;
import com.example.model.Question;

public class DefinationTypeService extends QuestionService{
	public DefinationTypeService() {
		this.setQuestion(new DefinationType());
	}

	@Override
	public void create() throws IOException {
		this.getQuestion();
		this.getAnswer();
	}

}

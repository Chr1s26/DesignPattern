package ExamManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionService {
	static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	Question question = new Question();
	
	public void createQuestion() throws IOException {
		System.out.println("Create a question");
		String createdquestion = bReader.readLine();
		question.setQuestion(createdquestion);
	}
	
	public String getQuestion() {
		return question.getQuestion();
	}
	
	public void createMultipleChoice() throws IOException {
		System.out.println("Created multiple choice for a question");
		String createdMultipleChoices = bReader.readLine();
		question.setQuestion(createdMultipleChoices);
	}
	
	public String[] getMultipleChoice() {
		return question.getMultipleChoices();
	}
	
	public void createAnswer() throws IOException {
		System.out.println("Enter an answer for that multiple choice for a question: ");
		String answer = bReader.readLine();
		question.setanswer(answer);
	}
	
	public String getAnswer() {
		return question.getanswer();
	}
	
	 public Question getQuestionObject() {
	        return question;
	    }
	
	
	
}

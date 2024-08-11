package ExamManagementSystem;

public class Question {
	
	private String question;
	private String answer;
	private String[] multipleChoices = new String[4];
	
	public Question() {
		
	}
	
	public Question(String question,String answer,String[] multipleChoice) {
		this.question = question;
		this.answer = answer;
		this.multipleChoices = multipleChoice;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String[] getMultipleChoices() {
		return multipleChoices;
	}
	
	public void setMultipleChoice(String[] multipleChoices) {
		this.multipleChoices = multipleChoices;
	}
	
	public String getanswer() {
		return answer;
	}
	
	public void setanswer(String answer) {
		this.answer = answer;
	}
}

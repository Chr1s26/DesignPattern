package ExamManagementSystem;

public class Exam {
    private Question[] questions;
    
    public Exam() {
        
    }
    
    public Exam(Question[] questions) {
        this.questions = questions;
    }
    
    public Question[] getQuestions() {
        return questions;
    }
    
    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
